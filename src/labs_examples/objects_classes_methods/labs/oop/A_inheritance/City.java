package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class City extends County {

    private String mayor;

    public City(int population, double avgTemp, String name, String president, String politicalStance, int noOfMayors, String mayor) {
        super(population, avgTemp, name, president, politicalStance, noOfMayors);
        this.mayor = mayor;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }
}
