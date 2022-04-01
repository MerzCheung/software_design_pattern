package 结构型.组合模式.透明方式;

// 树叶构件
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void add(Component c) {

    }

    public void delete(Component c) {

    }

    public Component getChild(int i) {
        return null;
    }

    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
