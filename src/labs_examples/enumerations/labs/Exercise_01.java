package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */


class Enumerations {
    public enum Languages {
        PYTHON,
        JAVA,
        JAVASCRIPT,
        C,
        GO;
    }


}

class ParEnum {
    public enum Snacks {

        CHIPS(2, 1.5), FRIES(3, 1.2), CANDY(1, 0.5);


        Snacks(int price, double oz) {
            this.price = price;
            this.oz = oz;
        }

        private final int price;
        private final double oz;


        public int getPrice() {
            return price;
        }

        public double getOz() {
            return oz;
        }
    }
}

