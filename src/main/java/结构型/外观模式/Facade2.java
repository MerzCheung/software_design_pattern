package 结构型.外观模式;

public class Facade2 extends AbstractFacade {

    private SubSystem1 subSystem1;
    private SubSystem3 subSystem3;
    private SubSystem4 subSystem4;

    public Facade2(SubSystem1 subSystem1, SubSystem3 subSystem3, SubSystem4 subSystem4) {
        this.subSystem1 = subSystem1;
        this.subSystem3 = subSystem3;
        this.subSystem4 = subSystem4;
    }

    @Override
    void method1() {
        subSystem1.request();
    }

    @Override
    void method2() {
        subSystem3.request();
        subSystem4.request();
    }
}
