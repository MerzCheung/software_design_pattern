package 结构型.装饰器模式;

/*

装饰器模式主要包含以下角色。
        抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
        具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。
        抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
        具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
*/


public class Client {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.show();
        System.out.println("--------------------------");
        Component d = new ConcreteDecorator(p);
        d.show();
        System.out.println("--------------------------");
        Component d2 = new Decorator(p);
        d2.show();
    }
}
