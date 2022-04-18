package 行为型.命令模式;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}
