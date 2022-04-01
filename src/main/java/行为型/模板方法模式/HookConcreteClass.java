package 行为型.模板方法模式;

public class HookConcreteClass extends HookAbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void HookMethod1() {
        super.HookMethod1();
    }

    @Override
    public boolean HookMethod2() {
        return false;
    }
}
