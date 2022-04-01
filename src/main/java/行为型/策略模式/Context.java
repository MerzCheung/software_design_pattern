package 行为型.策略模式;

import java.util.HashMap;

public class Context {

    private static final HashMap<String, Strategy> map = new HashMap<String, Strategy>();

    public Context() {
        map.put("a", new ConcreteStrategyA());
        map.put("b", new ConcreteStrategyB());
        map.put("c", new ConcreteStrategyC());
    }

    public void check(String key) {
        map.get(key).check();
    }
}
