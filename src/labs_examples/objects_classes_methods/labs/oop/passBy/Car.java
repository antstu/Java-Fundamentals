package labs_examples.objects_classes_methods.labs.oop.passBy;

public class Car {

    private String make;

    private String model;

    private String color;

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
