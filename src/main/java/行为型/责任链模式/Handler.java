package 行为型.责任链模式;

public abstract class Handler {

    //下一个处理者
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
