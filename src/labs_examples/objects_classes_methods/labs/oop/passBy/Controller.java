package labs_examples.objects_classes_methods.labs.oop.passBy;

public class Controller {

    public static void main(String[] args) {

        Car c = new Car("Nissan", "Xterra", "blue");
        passByReference(c);
        System.out.println(c.toString());

        int i = 10;
        passByValue(i);

        System.out.println(i);
    }


    public static void passByReference(Car car) {

        car.setColor("red");

    }

    public static void passByValue(int x) {

        x *= 1000;
    }
}
