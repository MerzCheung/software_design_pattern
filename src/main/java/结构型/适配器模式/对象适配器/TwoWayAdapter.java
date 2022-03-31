package 结构型.适配器模式.对象适配器;

// 双向适配器
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {

    private TwoWayTarget target;

    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    // 适配者
    public void specificRequest() {
        target.request();
    }

    // 目标
    public void request() {
        adaptee.specificRequest();
    }
}
