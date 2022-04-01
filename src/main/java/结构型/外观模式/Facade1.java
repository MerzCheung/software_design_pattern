package 结构型.外观模式;

public class Facade1 extends AbstractFacade {

    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public Facade1(SubSystem1 subSystem1, SubSystem2 subSystem2, SubSystem3 subSystem3) {
        this.subSystem1 = subSystem1;
        this.subSystem2 = subSystem2;
        this.subSystem3 = subSystem3;
    }

    @Override
    void method1() {
        subSystem1.request();
        subSystem2.request();
    }

    @Override
    void method2() {
        subSystem3.request();
    }
}
