package 结构型.装饰器模式;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        addFunction();
    }

    private void addFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
