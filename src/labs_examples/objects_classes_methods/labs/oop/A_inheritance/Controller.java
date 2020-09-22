package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Controller {

    public static void main(String[] args) {

        Country america = new Country(400_000_000, 68.3, "America", "Trump" );

        System.out.println(america.toString());

        City newYork = new City(9_000_000,65.5,"New York","Trump","Democratic",1,"DeBlasio");

        State newYorkState = new State(20_000_000, 63.2, "New York", "Trump", "Democratic");

        america.getAvgTemp();

        newYork.getAvgTemp();

        newYorkState.getAvgTemp();



    }
}
