package 结构型.外观模式;

/*

外观（Facade）模式包含以下主要角色。
        外观（Facade）角色：为多个子系统对外提供一个共同的接口。
        子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
        客户（Client）角色：通过一个外观角色访问各个子系统的功能。
*/

public class Client {

    public static void main(String[] args) {
        SubSystem1 s1 = new SubSystem1();
        SubSystem2 s2 = new SubSystem2();
        SubSystem3 s3 = new SubSystem3();
        SubSystem4 s4 = new SubSystem4();

        AbstractFacade facade1 = new Facade1(s1, s2, s3);
        facade1.method1();
        facade1.method2();
        System.out.println("--------------------------------");
        AbstractFacade facade2 = new Facade2(s1, s3, s4);
        facade2.method1();
        facade2.method2();
    }
}
