package 创建型.单例模式;

public class LazySingleton {
    /**
     * volatile 保证一致性与有序性（禁止指令重排）
     * 保证 instance 在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * 私有构造,避免类在外部被实例化
     */
    private LazySingleton() {
    }

    /**
     * 如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
     * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
