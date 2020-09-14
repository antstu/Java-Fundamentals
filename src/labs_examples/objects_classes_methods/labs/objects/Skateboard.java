package labs_examples.objects_classes_methods.labs.objects;





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