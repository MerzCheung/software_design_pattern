package 创建型.抽象工厂模式;


public class AbstractFactorySample {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        factory.createProduct1().show();
    }

    interface Product {
        void show();
    }

    static class Product1 implements Product {

        public void show() {
            System.out.println("具体产品1.。。。。。。。。。");
        }
    }

    static class Product2 implements Product {

        public void show() {
            System.out.println("具体产品2.。。。。。。。。。");
        }
    }

    /**
     * 抽象工厂
     */
    interface AbstractFactory {
        public Product createProduct1();
        public Product createProduct2();
    }

    /**
     * 具体工厂
     */
    static class ConcreteFactory1 implements AbstractFactory {

        public Product createProduct1() {
            System.out.println("工厂 创建了 产品1");
            return new Product1();
        }

        public Product createProduct2() {
            System.out.println("工厂 创建了 产品2");
            return new Product2();
        }
    }
}
