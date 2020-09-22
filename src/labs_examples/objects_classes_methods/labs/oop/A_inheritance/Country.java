package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Country {

    private int population;
    private double avgTemp;
    private String name;
    private String president;

    public Country(int population, double avgTemp, String name, String president) {
        this.population = population;
        this.avgTemp = avgTemp;
        this.name = name;
        this.president = president;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", avgTemp=" + avgTemp +
                ", name='" + name + '\'' +
                ", president='" + president + '\'' +
                '}';
    }
}
