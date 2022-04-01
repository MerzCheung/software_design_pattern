package 行为型.策略模式;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.check("a");
        context.check("b");
    }
}
