package labs_examples.generics.labs;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */


class Generic3 {

    public static void main(String[] args) {

        //sum
        double sum = sum(10,2);
        System.out.println(sum);

        //num of elements
        ArrayList<String> checkPalindrome = new ArrayList<>();
        checkPalindrome.add("dad");
        checkPalindrome.add("mom");
        checkPalindrome.add("testing");

        System.out.println(numOfPal(checkPalindrome));



    }

    public static <N extends Number, D extends Number> double sum(N a, D b) {

        return a.doubleValue() + b. doubleValue();

    }

    public static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;


        while (i < j) {

            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static <C extends Collection<String>> int numOfPal(C collection) {

        int palCount = 0;
        for (String str: collection) {
            boolean check = checkPalindrome(str);

            if(check) {
                palCount++;
            }

        }

        return palCount;
    }





}