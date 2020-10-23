package labs_examples.lambdas.labs;

public class Example {

    public static void main(String[] args) {
//        Traditonal Interface Implementation
        IntFuncImpl<String> traditional = new IntFuncImpl();
        String s = traditional.apply(7);
        System.out.println(s);

//        Anon Inner Class Implementation
        IntFunction<String> anon = new IntFunction<String>() {
            @Override
            public String apply(int i) {
                return String.valueOf(i);
            }
        };
        String st = anon.apply(7);

//        Lambda Implementation
        IntFunction<String> lam = (int a) -> String.valueOf(a);
        String str = lam.apply(8);



    }
}

@FunctionalInterface
interface IntFunction<T> {

    public T apply(int i);

    default String test() {
        return "test";
    }

}


class IntFuncImpl<T> implements IntFunction<T> {


    @Override
    public T apply(int i) {
        return (T) String.valueOf(i);
    }
}