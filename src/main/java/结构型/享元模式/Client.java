package 结构型.享元模式;

/*

享元模式的主要角色有如下。
        抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
        具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
        非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
        享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，
            如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。

享元模式其实是工厂方法模式的一个改进机制，享元模式同样要求创建一个或一组对象，并且就是通过工厂方法模式生成对象的，只不过享元模式为工厂方法模式增加了缓存这一功能。

*/

public class Client {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a1 = flyweightFactory.getFlyweight("a");
        Flyweight a2 = flyweightFactory.getFlyweight("a");
        Flyweight a3 = flyweightFactory.getFlyweight("a");
        Flyweight b1 = flyweightFactory.getFlyweight("b");
        Flyweight b2 = flyweightFactory.getFlyweight("b");

        a1.operation(new UnsharedConcreteFlyweight("info_a1"));
        a2.operation(new UnsharedConcreteFlyweight("info_a2"));
        a3.operation(new UnsharedConcreteFlyweight("info_a3"));
        b1.operation(new UnsharedConcreteFlyweight("info_b1"));
        b2.operation(new UnsharedConcreteFlyweight("info_b2"));
    }
}
