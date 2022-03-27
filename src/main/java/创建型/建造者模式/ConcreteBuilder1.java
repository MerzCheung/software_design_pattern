package 创建型.建造者模式;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildTv() {
        drawingRoom.setTv("TCL");
    }

    @Override
    public void buildSofa() {
        drawingRoom.setSofa("顾家");
    }

    @Override
    public void buildXbox() {
        drawingRoom.setXbox("使命召唤");
    }
}
