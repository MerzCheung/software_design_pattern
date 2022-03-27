package 创建型.单例模式;

public class HungrySingleton {
    /**
     * final 不可改变
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 私有构造，避免类在外部被实例化
     */
    private HungrySingleton() {
    }

    /**
     * 线程安全
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
