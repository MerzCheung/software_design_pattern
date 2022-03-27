package 创建型.单例模式;

/**
 * 枚举实现单例模式
 * 没有反射攻击和反序列化攻击
 */
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}
