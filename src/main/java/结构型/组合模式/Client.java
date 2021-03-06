package 结构型.组合模式;

/*

组合模式包含以下主要角色。
        抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。
            在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）
        树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
        树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。
            它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
*/

import 结构型.组合模式.安全方式.Composite;
import 结构型.组合模式.安全方式.Leaf;

public class Client {

    public static void main(String[] args) {
        // 透明方式
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        Leaf l1 = new Leaf("树叶1");
        Leaf l2 = new Leaf("树叶2");
        Leaf l3 = new Leaf("树叶3");
        c1.add(c2);
        c1.add(l1);
        c2.add(l2);
        c2.add(l3);
        c1.operation();
        // 安全方式
    }
}
