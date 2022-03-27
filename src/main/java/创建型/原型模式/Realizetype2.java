package 创建型.原型模式;

/**
 * 原型模式的克隆分为浅克隆和深克隆。
 * 深克隆：在浅度克隆的基础上，对于要克隆的对象中的非基本数据类型的属性对应的类，也实现克隆，
 *          这样对于非基本数据类型的属性，复制的不是一份引用，即新产生的对象和原始对象中的非基本数据类型的属性指向的不是同一个对象
 */

public class Realizetype2 implements Cloneable {

    private Integer i;

    private Property2 property2;

    public Property2 getProperty2() {
        return property2;
    }

    public void setProperty2(Property2 property2) {
        this.property2 = property2;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Realizetype2() {
        System.out.println("具体原型创建成功！");
    }

    public Realizetype2(Integer i, Property2 property2) {
        this.i = i;
        this.property2 = property2;
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        Realizetype2 clone = (Realizetype2) super.clone();
        clone.property2 = (Property2) property2.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Property2 p1 = new Property2();
        p1.setName("张三");
        Realizetype2 obj1 = new Realizetype2(1, p1);
        Realizetype2 obj2 = (Realizetype2) obj1.clone();
        System.out.println(obj1 == obj2); // false
        System.out.println(obj1.getI().equals(obj2.getI())); // true
        System.out.println(obj1.getProperty2().equals(obj2.getProperty2())); // true
        obj2.setI(2);
        // 基本数据类型是直接复制一份新的
        System.out.println(obj1.getI()); // 1
        System.out.println(obj2.getI()); // 2

        /*深拷贝：要克隆的类和类中所有非基本数据类型的属性对应的类
        1、都实现java.lang.Cloneable接口
        2、都重写java.lang.Object.clone()方法*/
        obj2.getProperty2().setName("赵六");
        System.out.println(obj1.getProperty2().getName()); // 张三
        System.out.println(obj2.getProperty2().getName()); // 赵六
        Property2 p4 = new Property2();
        p4.setName("田七");
        obj2.setProperty2(p4);
        System.out.println(obj1.getProperty2().getName()); // 张三
        System.out.println(obj2.getProperty2().getName()); // 田七
    }
}
