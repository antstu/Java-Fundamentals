package labs_examples.objects_classes_methods.labs.objects;

public class Exercise03 {

    public static void main(String[] args) {

        Human one = new Human("Anthony");
        Human two = new Human ("Bob", 25);
        Human three = new Human("Tony", 21, 155);

        System.out.println(one.name);
        System.out.println(two.age);
        System.out.println(three.height);


    }
}

class Human {

    String name;

    int age;

    int height;

    public Human(String name) {

        this.name = name;

    }

    public Human(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public Human(String name, int age, int height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }
}
