package 结构型.装饰器模式;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void show() {
        component.show();
    }
}
