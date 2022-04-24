package 行为型.备忘录模式;

/**
 * @author v_merzhang
 * @since 2022/4/24 17:49
 */
//发起人
public class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
