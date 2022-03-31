package 结构型.装饰器模式;

public class ConcreteComponent implements Component {

    public void show() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
