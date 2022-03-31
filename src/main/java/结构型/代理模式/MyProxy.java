package 结构型.代理模式;

/**
 * 静态代理
 */
public class MyProxy implements Subject {

    private RealSubject realSubject;

    public MyProxy() {
    }

    public MyProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void show() {
        System.out.println("我在前面输出一下。。");
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.show();
        System.out.println("我在后面输出一下。。");
    }
}
