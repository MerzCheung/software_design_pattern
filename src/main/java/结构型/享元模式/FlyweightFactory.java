package 结构型.享元模式;


import java.util.concurrent.ConcurrentHashMap;

//享元工厂角色
public class FlyweightFactory {

    private ConcurrentHashMap<String, Flyweight> map = new ConcurrentHashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = map.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            map.put(key, flyweight);
        }
        return flyweight;
    }
}
