package 行为型.模板方法模式;

// 抽象类
public abstract class HookAbstractClass {

    // 模板方法
    public void templateMethod() {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }

    //钩子方法1
    public void HookMethod1() {

    }
    //钩子方法2
    public boolean HookMethod2() {
        return true;
    }


    // 具体方法
    protected void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    // 抽象方法， 给子类实现
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();

}
