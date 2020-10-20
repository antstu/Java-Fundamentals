package labs_examples.enumerations.labs;

public class TestingEnumeration {
    public static void main(String[] args) {

        for (enumerations.Languages lang :enumerations.Languages.values()) {
            System.out.println(lang);
        }


        //parEnum

        for (parEnum.Snacks snack: parEnum.Snacks.values()) {
            System.out.print("Snack: " + snack + " " + snack.getPrice() + " ");
        }


    }
}
