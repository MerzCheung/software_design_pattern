package 创建型.单例模式;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类实现单例
 *
 * 在Java虚拟机规范中，没有强制约束什么时候要开始加载，但是，却严格规定了几种情况必须进行初始化（加载，验证，准备则需要在初始化之前开始）：
 *
 * 　　1. 遇到 new、getstatic、putstatic、或者invokestatic 这4条字节码指令，如果没有类没有进行过初始化，则触发初始化
 *
 * 　　2. 使用java.lang.reflect包的方法，进行反射调用的时候，如果没有初始化，则先触发初始化
 *
 * 　　3. 初始化一个类时候，如果发现父类没有初始化，则先触发父类的初始化
 *
 * 因为外部类对内部类的引用属于被动引用，不属于前面提到的三种必须进行初始化的情况，所以加载类本身并不需要同时加载内部类。
 * 在需要实例化该类是才触发内部类的加载以及本类的实例化，做到了延时加载（懒加载），节约内存。
 * 同时因为JVM会保证一个类的<cinit>()方法（初始化方法）执行时的线程安全，从而保证了实例在全局的唯一性
 */
public class StaticClass implements Serializable {
    /**
     * 私有构造，避免类在外部被实例化
     */
    private StaticClass() {
    }

    private static class SingleHolder {
        private static final StaticClass instance = new StaticClass();
    }

    public static StaticClass getInstance() {
        return SingleHolder.instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        StaticClass instance = StaticClass.getInstance();
        /*
        结果：false
        反射攻击， 违背了单例模式的原则
        */
        Constructor<StaticClass> constructor = StaticClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticClass staticClass = constructor.newInstance();
        System.out.println(instance == staticClass);

        /*
        结果：false
        反序列化攻击， 违背了单例模式的原则
        需要实现java.io.Serializable接口
        */
        byte[] serialize = SerializationUtils.serialize(instance);
        StaticClass deserialize = SerializationUtils.deserialize(serialize);
        System.out.println(instance == deserialize);
    }
}
