package labs_examples.objects_classes_methods.labs.objects;



class Example2 {

    public static void main(String[] args) {

        Trucks trucks = new Trucks("metal", 3);

        Wheels wheels = new Wheels(35);

        Deck deck = new Deck("wood", 8.25);

        Bearings bearings = new Bearings("fast");



        Skateboard mySkateboard = new Skateboard(deck, wheels, trucks, bearings);

        System.out.println("I ride a " + mySkateboard.deck.material + " skateboard with "

                + mySkateboard.wheels.size + "mm size wheels and " + mySkateboard.bearings.speed + " bearings");


        System.out.println(mySkateboard.toString());

        Trucks herTrucks = new Trucks("plastic", 5);

        Wheels herWheels = new Wheels(36);

        Deck herDeck = new Deck("wood", 8.0);

        Bearings herBearings = new Bearings("slow");

        Skateboard herSkateboard = new Skateboard(herDeck, herWheels, herTrucks, herBearings);

        System.out.println("She rides a " + herSkateboard.deck.material + " skateboard with "

                + herSkateboard.wheels.size + "mm size wheels and " + herSkateboard.bearings.speed + " bearings");


        System.out.println(herSkateboard.toString());

    }

}


public class Skateboard {

    Deck deck;
    Wheels wheels;
    Trucks trucks;
    Bearings bearings;

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

    int size;

    public Wheels(int size) {
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

    String material;
    double size;

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

    String material;
    double weight;

    public Trucks(String material, double weight) {

        this.material = material;
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

    String speed;


    public Bearings(String speed) {

        this.speed = speed;

    }

    @Override
    public String toString() {
        return "Bearings{" +
                "speed='" + speed + '\'' +
                '}';
    }
}