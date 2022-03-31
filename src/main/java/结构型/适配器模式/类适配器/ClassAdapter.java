package 结构型.适配器模式.类适配器;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {

    public void request() {
        System.out.println("适配逻辑》》》》》");
        show();
    }
}
