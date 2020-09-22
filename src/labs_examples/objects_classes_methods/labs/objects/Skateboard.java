package labs_examples.objects_classes_methods.labs.objects;



class Example2 {

    public static void main(String[] args) {

        Trucks trucks = new Trucks("metal", 3);

        Wheels wheels = new Wheels(35);

        Deck deck = new Deck("wood", 8.25);

        String m = deck.getMaterial();

        Bearings bearings = new Bearings("fast");

        int x = Math.multiplyExact(2,3);

        Skateboard mySkateboard = new Skateboard(deck, wheels, trucks, bearings);

        System.out.println("I ride a " + mySkateboard.getDeck().getMaterial() + " skateboard with "

                + mySkateboard.getWheels().getSize() + "mm size wheels and " + mySkateboard.getBearings().getSpeed() + " bearings");


        System.out.println(mySkateboard.toString());

        Trucks herTrucks = new Trucks("plastic", 5);

        Wheels herWheels = new Wheels(36);

        Deck herDeck = new Deck("wood", 8.0);

        Bearings herBearings = new Bearings("slow");

        Skateboard herSkateboard = new Skateboard(herDeck, herWheels, herTrucks, herBearings);

        System.out.println("She rides a " + herSkateboard.getDeck().getMaterial() + " skateboard with "

                + herSkateboard.getWheels().getSize() + "mm size wheels and " + herSkateboard.getBearings().getSpeed() + " bearings");


        System.out.println(herSkateboard.toString());

    }

}


public class Skateboard {

    private Deck deck;
    private Wheels wheels;
    private Trucks trucks;
    private Bearings bearings;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Trucks getTrucks() {
        return trucks;
    }

    public void setTrucks(Trucks trucks) {
        this.trucks = trucks;
    }

    public Bearings getBearings() {
        return bearings;
    }

    public void setBearings(Bearings bearings) {
        this.bearings = bearings;
    }

    public Skateboard(Deck deck, Wheels wheels, Trucks trucks, Bearings bearings) {

        this.deck = deck;
        this.wheels = wheels;
        this.trucks = trucks;
        this.bearings = bearings;
    }

    @Override
    public String toString() {
        return "Skateboard{" +
                "deck=" + deck +
                ", wheels=" + wheels +
                ", trucks=" + trucks +
                ", bearings=" + bearings +
                '}';
    }
}


class Wheels {

    private int size;

    private static String color = "red";

    public Wheels(int size) {
        this.size = size;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                '}';
    }
}

class Deck {

    private String material;
    private double size;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Deck(String material, double size) {

        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "material='" + material + '\'' +
                ", size=" + size +
                '}';
    }
}

class Trucks {

    private String material;
    private double weight;

    public Trucks(String material, double weight) {

        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Bearings {

    private String speed;


    public Bearings(String speed) {

        this.speed = speed;

    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bearings{" +
                "speed='" + speed + '\'' +
                '}';
    }
}