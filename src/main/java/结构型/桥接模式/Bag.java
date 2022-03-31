package 结构型.桥接模式;

public abstract class Bag {

    protected Color color;

    public Bag(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
