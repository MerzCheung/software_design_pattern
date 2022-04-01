package 结构型.组合模式.安全方式;

// 树叶构件
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
