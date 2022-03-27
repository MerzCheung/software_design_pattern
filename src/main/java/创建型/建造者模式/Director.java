package 创建型.建造者模式;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public DrawingRoom construct() {
        builder.buildTv();
        builder.buildSofa();
        builder.buildXbox();
        return builder.getDrawingRoom();
    }
}
