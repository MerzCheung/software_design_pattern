package 创建型.原型模式;
/*
原型模式的优点：
        Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
        可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
原型模式的缺点：
        需要为每一个类都配置一个 clone 方法
        clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
        当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
*/

/**
 * 原型模式的克隆分为浅克隆和深克隆。
 * 浅克隆：对于要克隆的对象，对于其基本数据类型的属性，复制一份给新产生的对象，对于非基本数据类型的属性，仅仅复制一份引用给新产生的对象，
 *          即新产生的对象和原始对象中的非基本数据类型的属性都指向的是同一个对象。
 */

public class Realizetype implements Cloneable {

    private Integer i;

    private Property property;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    public Realizetype(Integer i, Property property) {
        this.i = i;
        this.property = property;
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Property p1 = new Property();
        p1.setName("张三");
        Realizetype obj1 = new Realizetype(1, p1);
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj1 == obj2); // false
        System.out.println(obj1.getI().equals(obj2.getI())); // true
        System.out.println(obj1.getProperty().equals(obj2.getProperty())); // true
        obj2.setI(2);
        // 基本数据类型是直接复制一份新的
        System.out.println(obj1.getI()); // 1
        System.out.println(obj2.getI()); // 2
        // 浅拷贝：非基本数据类型仅仅复制一份引用给新产生的对象
        obj2.getProperty().setName("李四");
        System.out.println(obj1.getProperty().getName()); // 李四
        System.out.println(obj2.getProperty().getName()); // 李四
        Property p2 = new Property();
        p2.setName("王五");
        obj2.setProperty(p2);
        System.out.println(obj1.getProperty().getName()); // 李四
        System.out.println(obj2.getProperty().getName()); // 王五
    }
}
