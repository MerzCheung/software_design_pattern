package 行为型.命令模式;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者调用命令");
        command.execute();
    }
}
