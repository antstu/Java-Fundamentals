package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class County extends State {

    private int noOfMayors;

    public County(int population, double avgTemp, String name, String president, String politicalStance, int noOfMayors) {
        super(population, avgTemp, name, president, politicalStance);
        this.noOfMayors = noOfMayors;
    }

    public int getNoOfMayors() {
        return noOfMayors;
    }

    public void setNoOfMayors(int noOfMayors) {
        this.noOfMayors = noOfMayors;
    }
}
