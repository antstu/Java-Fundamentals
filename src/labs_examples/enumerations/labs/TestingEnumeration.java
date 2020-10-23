package labs_examples.enumerations.labs;

public class TestingEnumeration {
    public static void main(String[] args) {

        for (Enumerations.Languages lang : Enumerations.Languages.values()) {
            System.out.println(lang);
        }


        //ParEnum

        for (ParEnum.Snacks snack: ParEnum.Snacks.values()) {
            System.out.print("Snack: " + snack + " " + snack.getPrice() + " ");
        }


    }
}
