package 行为型.中介者模式;

//抽象中介者
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
