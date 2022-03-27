package 创建型.建造者模式;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildTv() {
        drawingRoom.setTv("康佳");
    }

    @Override
    public void buildSofa() {
        drawingRoom.setSofa("芝华士");
    }

    @Override
    public void buildXbox() {
        drawingRoom.setXbox("侠盗猎车");
    }
}
