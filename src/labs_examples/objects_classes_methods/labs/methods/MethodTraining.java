package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

public class MethodTraining {

    private static int number = 14;

    public static void main(String[] args) {

        passRef(number);
        passRef(4);

        add(1,2,3);
        add(1,2);

        largestNum(5,20,30,75,24,32);

        countConsonants("Anthony");

        printTop(10);

        checkPrime(5);

        int [] highLow = highLow(1,2,3,4,5,6,7,8);

        System.out.println("High low array is " + Arrays.toString(highLow));

        reverseArr(1,2,3,4,5,6,7);



    }


    private static int add(int a, int b) {

        return a + b;

    }

    private static int add(int a, int b, int c) {

        return a + b + c;

    }

    private static void passRef(int num) {

        System.out.println(num);

    }

    private static void largestNum(int... args) {

        int largest = 0;

        for (int num: args) {

            if (num > largest) {

                largest = num;

            }
        }

        System.out.println("Largest number is: " + largest);
    }


    private static void countConsonants(String word) {

        int count = 0;

        for(int index = 0; index < word.length(); index++){
            char c = Character.toLowerCase(word.charAt(index));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                continue;
            }else if(c != ' '){
                count++;
            }
        }

        System.out.println("Consonants: " + count);

    }

    public static void printTop(int height) {
        for (int i = 1; i < height; i++) {
            printStar(i);
            printSpace(2 * (height - i));
            printStar(i);
            System.out.println();
        }
    }

    public static void printStar(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    public static void printSpace(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    public static void checkPrime(int num) {

        boolean flag = false;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static int[] highLow(int... nums) {

        int low = nums[0];
        int high = nums[0];

        for(int num: nums) {

            if(num < low){
                low = num;
            }

            if(num > high){
                high = num;
            }

        }

        int[] arr = {low, high};

        return arr;



    }


//    private static ArrayList<int>


    public static void reverseArr(int... nums) {

        int temp;

        for(int i = 0; i < nums.length / 2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(" Reversed array is " + Arrays.toString(nums));


    }



}
