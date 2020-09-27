package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        BlackjackController controller = new BlackjackController();
        controller.playBlackJack();

    }

    public void playBlackJack() {

        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Enter player name: ");

        name = input.next();
        input.nextLine();

        Player user = new Player(name);
        Player computer = new Player("computer");







        System.out.print("Enter money amount: ");

        int money = input.nextInt();
        input.nextLine();

        user.setMoney(money);











//        Pseudo code:
//        cards are dealt
//        users place bets?
//        user decides on extra card
//        dealer/comp decides on extra card
//        show cards


        while (user.getMoney() > 0 ) {

            while (user.getHand().greaterThan21() == false && computer.getHand().greaterThan21()) {



                check = dealCards(user,computer);

                if(check) {
                    break;
                }
            }

            //winner



        }


        //would you like to play again











//        while (user.getHand().greaterThan21() == false && computer.getHand().greaterThan21() == false) {
//
//
//            Boolean check = false;
//

//
//
//            System.out.println(user.getName() + ", " + user.getHand().toString());
//            System.out.println(computer.getName() + ", " + computer.getHand().toString());
//
//            if(computer.getHand().getHandValue() < user.getHand().getHandValue())
//                System.out.println("You win!");
//            else if (computer.getHand().getHandValue() == user.getHand().getHandValue()) {
//                System.out.println("Split pot");
//            }
//            else
//                System.out.println("You lose.");
//            break;
//
//        }
//        if (user.getHand().greaterThan21() == true) {
//            System.out.print("You busted. ");
//        }
//        if (computer.getHand().greaterThan21() == true) {
//            System.out.print("Computer busted. ");
//        }



    }

    public static Boolean dealCards(Player user, Player computer) {

        Scanner input = new Scanner(System.in);


        Boolean check = false;

        Deck deck = new Deck();

        deck.deal(user);
        deck.deal(computer);

        deck.deal(user);
        deck.deal(computer);


        while (check == false) {
            System.out.print("Another card? y or n: ");
            if (input.next().equals("y")) {
                    deck.deal(user);
                    System.out.println(user.getName() + ", " + user.getHand().toString());
                } else {
                    check = true;
                }
            }

            if (computer.computerAI()) {
                deck.deal(computer);
            }


        System.out.println(user.getName() + ", " + user.getHand().toString());
        System.out.println(computer.getName() + ", " + computer.getHand().toString());

        return check;

    }
}