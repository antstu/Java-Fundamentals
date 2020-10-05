package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void main(String[] args) {
        staticExample();
        ClassA staticTest = new ClassA();
        staticTest.nonStaticExample();
    }

    public static void staticExample(){

        System.out.println("Hello");
//         A static method calling another static method in the same class
        printGoodbye();
//        A static method calling a non-static method in the same class
        ClassA obj = new ClassA();
        obj.printSup();
//        A static method calling a static method in another class
        ClassB.printCiao();
//        A static method calling a non-static method in another class
        ClassB obj2 = new ClassB();
        obj2.printWave();
    }


    public void nonStaticExample() {
//        A static method calling a static method in another class
        printSup();
//        A non-static method calling a non-static method in another class
        ClassB obj3 = new ClassB();
        obj3.printWave();
//        A non-static method calling a static method in the same class
        printGoodbye();
//        A non-static method calling a static method in another class
        ClassB.printCiao();
    }

    public static void printGoodbye() {
        System.out.println("Goodbye");
    }

    public void printSup() {
        System.out.println("Sup");
    }
}
