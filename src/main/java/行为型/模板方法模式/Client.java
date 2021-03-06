package 行为型.模板方法模式;

/*

模板方法模式包含以下主要角色。
        1）抽象类/抽象模板（Abstract Class）
        抽象模板类，负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。这些方法的定义如下。

        ① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。

        ② 基本方法：是整个算法中的一个步骤，包含以下几种类型。
        抽象方法：在抽象类中声明，由具体子类实现。
        具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它。
        钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
        2）具体子类/具体实现（Concrete Class）
        具体实现类，实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
*/

public class Client {
    public static void main(String[] args) {
        HookConcreteClass hookConcreteClass = new HookConcreteClass();
        hookConcreteClass.templateMethod();
    }
}
