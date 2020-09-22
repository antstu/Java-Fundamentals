package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class State extends Country{

    private String politicalStance;

    public State(int population, double avgTemp, String name, String president, String politicalStance) {
        super(population, avgTemp, name, president);
        this.politicalStance = politicalStance;
    }

    @Override
    public double getAvgTemp() {
        System.out.println("Returning the avg temp for State");
        //do calc
        return 82.3;
    }

    public String getPoliticalStance() {
        return politicalStance;
    }

    public void setPoliticalStance(String politicalStance) {
        this.politicalStance = politicalStance;
    }
}
