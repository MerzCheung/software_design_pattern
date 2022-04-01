package 结构型.组合模式.透明方式;

// 抽象构件
public interface Component {
    public void add(Component c);

    public void delete(Component c);

    public Component getChild(int i);

    public void operation();
}
