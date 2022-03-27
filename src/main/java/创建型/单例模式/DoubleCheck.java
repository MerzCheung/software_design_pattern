package 创建型.单例模式;

public class DoubleCheck {

    private static volatile DoubleCheck instance = null;

    private DoubleCheck() {
    }

    /**
     * 比懒汉式直接在方法上面加锁提高了效率，并且也是线程安全的，
     * 同时也节省了内存
     * @return
     */
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
