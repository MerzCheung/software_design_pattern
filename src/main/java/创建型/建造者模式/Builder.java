package 创建型.建造者模式;

// 建筑工人抽象类
abstract class Builder {

    protected DrawingRoom drawingRoom = new DrawingRoom();

    public abstract void buildTv();

    public abstract void buildSofa();

    public abstract void buildXbox();

    public DrawingRoom getDrawingRoom() {
        return drawingRoom;
    }
}
