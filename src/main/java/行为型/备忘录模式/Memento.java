package 行为型.备忘录模式;

/**
 * @author v_merzhang
 * @since 2022/4/24 17:48
 */
//备忘录
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
