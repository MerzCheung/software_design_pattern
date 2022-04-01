package 结构型.组合模式.透明方式;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

// 树枝构件
public class Composite implements Component {
    private ArrayList<Component> list = new ArrayList<Component>();

    public void add(Component c) {
        list.add(c);
    }

    public void delete(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return list.get(i);
    }

    public void operation() {
        for (Object obj : list) {
            ((Component) obj).operation();
        }
    }
}
