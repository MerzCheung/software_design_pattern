package 行为型.备忘录模式;

/**
 * @author v_merzhang
 * @since 2022/4/24 17:49
 */
//管理者
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m) {
        memento = m;
    }
    public Memento getMemento() {
        return memento;
    }
}
