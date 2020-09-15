package labs_examples.objects_classes_methods.labs.objects;

public class Exercise02 {

    public static void main(String[] args) {

        Pet animal = new Pet("Lab");

        Person owner = new Person("Anthony");

        System.out.println(owner.name + " owns a " + animal.type);

    }
}


class Pet {

    String type;

    public Pet(String type) {

        this.type = type;
    }
}

class Person  {

    String name;

    public Person(String name) {

        this.name = name;
    }
}
