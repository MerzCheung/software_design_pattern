package 创建型.工厂方法模式;
/*

优点：
        用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
        灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。
        典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足迪米特法则、依赖倒置原则和里氏替换原则。
缺点：
        类的个数容易过多，增加复杂度
        增加了系统的抽象性和理解难度
        抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。
应用场景：
        客户只知道创建产品的工厂名，而不知道具体的产品名。如 TCL 电视工厂、海信电视工厂等。
        创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口。
        客户不关心创建产品的细节，只关心产品的品牌

工厂方法模式的主要角色如下。
抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
*/

public class FactoryMethodSample {

    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProduct().show();
    }

    /**
     * 抽象产品
     */
    interface Product {
        void show();
    }

    /**
     * 具体产品
     */
    static class Product1 implements Product {

        public void show() {
            System.out.println("具体产品1.。。。。。。。。。");
        }
    }

    /**
     * 具体产品
     */
    static class Product2 implements Product {

        public void show() {
            System.out.println("具体产品2.。。。。。。。。。");
        }
    }

    /**
     * 抽象工厂
     */
    interface AbstractFactory {
        public Product createProduct();
    }

    /**
     * 具体工厂
     */
    static class ConcreteFactory1 implements AbstractFactory {

        public Product createProduct() {
            System.out.println("工厂1 创建了 产品1");
            return new Product1();
        }
    }

    /**
     * 具体工厂
     */
    static class ConcreteFactory2 implements AbstractFactory {

        public Product createProduct() {
            System.out.println("工厂1 创建了 产品1");
            return new Product2();
        }
    }
}
