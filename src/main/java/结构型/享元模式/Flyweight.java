package 结构型.享元模式;



//抽象享元角色
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
