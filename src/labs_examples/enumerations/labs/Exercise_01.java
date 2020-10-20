package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */


class enumerations {
    public enum Languages {
        PYTHON,
        JAVA,
        JAVASCRIPT,
        C,
        GO;
    }


}

class parEnum {
    public enum Snacks {
        CHIPS(2), FRIES(3), CANDY(1);
        Snacks(int price) {
            this.price = price;
        }

        private final int price;

        public int getPrice() {
            return price;
        }
    }
}

