package practice;

class Flower{
    String type;

    public Flower(String type) {
        this.type = type;
    }
}

class MariGold extends Flower{
    int petals;

    public MariGold(int petals, String type) {
        super(type);
        this.petals = petals;
    }

    @Override
    public String toString() {
        return petals+" "+type;
    }
}

public class MainClass {
    public static void main(String[] args) {
        MariGold m = new MariGold(5, "flower");
        System.out.println(m);
    }
}
