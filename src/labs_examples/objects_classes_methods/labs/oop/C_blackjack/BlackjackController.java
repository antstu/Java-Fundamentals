package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        BlackjackController controller = new BlackjackController(); //call non-static method from static method
        controller.playBlackJack();

    }

    public void playBlackJack() {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter player name: ");

        String name = input.next();
        input.nextLine();

        Player user = new Player(name);
        Player computer = new Player("computer");


        Deck deck = new Deck();

        deck.deal(user);
        deck.deal(computer);

        deck.deal(user);
        deck.deal(computer);


        System.out.println(user.getName() + ", " + user.getHand().toString());
        System.out.println(computer.getName() + ", " + computer.getHand().toString());

        while (user.getHand().greaterThan21() == false && computer.getHand().greaterThan21() == false) {
            System.out.print("Would you like another card? (Please print y or no): ");

            if(input.next().equals("y")) {
                deck.deal(user);
                System.out.println(user.getName() + ", " + user.getHand().toString());
            }else{
                System.out.println(user.getName() + ", " + user.getHand().toString());
                System.out.println(computer.getName() + ", " + computer.getHand().toString());
                if(computer.getHand().getHandValue() < user.getHand().getHandValue())
                    System.out.println("You win!");
                else
                    System.out.println("You lose to the computer.");
                return;
            }
        }
        if (user.getHand().greaterThan21() == true) {
            System.out.print("You busted. ");
        }



    }
}
