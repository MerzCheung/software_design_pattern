package 结构型.桥接模式;

public class Wallet extends Bag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
