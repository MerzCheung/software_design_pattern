package 创建型.建造者模式;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Director director = new Director(concreteBuilder1);
        DrawingRoom construct = director.construct();
        construct.show();

        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        Director director1 = new Director(concreteBuilder2);
        DrawingRoom construct1 = director1.construct();
        construct1.show();
    }
}
