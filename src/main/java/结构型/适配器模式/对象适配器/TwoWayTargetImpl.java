package 结构型.适配器模式.对象适配器;

public class TwoWayTargetImpl implements TwoWayTarget {
    public void request() {
        System.out.println("目标接口调用》》》》》》》》");
    }
}
