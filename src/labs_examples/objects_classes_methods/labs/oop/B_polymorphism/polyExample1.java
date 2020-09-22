package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class polyExample1 {

    public static void main(String[] args) {

        ComplexCalc test = new ComplexCalc();

        test.add(2,5);

        IPhone8 phone1 = new IPhone8();

        phone1.turnOn();
        phone1.turnOff();





        ///


        IPhone9 phone2 = new IPhone9();

        PhoneExample example = new PhoneExample(phone1);


        example.testPhone();

        example.setPhone(phone2);

        example.testPhone();


    }






}

interface Calculation {

    int add(int a, int b);
}

class SimpleCalc implements Calculation{

    public int add(int a, int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {

        return a + b + c;
    }
}

class ComplexCalc extends SimpleCalc{


    @Override
    public int add(int a, int b) {
        System.out.println("Overriding method");

        return a + b;

    }


}
////

interface Phone {

    void turnOn();
    void turnOff();

}

class IPhone implements Phone {

    public void turnOn() {
        System.out.println("Turning on");
    }

    public void turnOff() {
        System.out.println("Turning off");
    }


}

class IPhone8 extends IPhone {

    @Override
    public void turnOn() {
        System.out.println("turning on Iphone 8");
    }

}

class IPhone9 extends IPhone {

    @Override
    public void turnOn() {
        System.out.println("turning on Iphone 9");
    }

}




class PhoneExample {
    Phone phone;

    public PhoneExample(Phone phone){
        this.phone = phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void testPhone() {

        phone.turnOn();
        phone.turnOff();
    }
}


