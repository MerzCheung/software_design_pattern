package 结构型.适配器模式;

/*
适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
适配器模式（Adapter）包含以下主要角色。
        目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
        适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
        适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
*/

import 结构型.适配器模式.对象适配器.TwoWayAdapteeImpl;
import 结构型.适配器模式.对象适配器.TwoWayAdapter;
import 结构型.适配器模式.对象适配器.TwoWayTargetImpl;
import 结构型.适配器模式.类适配器.ClassAdapter;
import 结构型.适配器模式.类适配器.Target;

public class Client {

    public static void main(String[] args) {
//        Target target = new ClassAdapter();
//        target.request();

        TwoWayAdapter adapter = new TwoWayAdapter(new TwoWayAdapteeImpl());
        adapter.request();
        TwoWayAdapter adapter1 = new TwoWayAdapter(new TwoWayTargetImpl());
        adapter1.specificRequest();
    }
}
