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


        while (user.getMoney() > 0 ) {

            Boolean win = false;
            Boolean split = false;
            int bet;

            do {
                System.out.print("Please set a bet: ");
                bet = input.nextInt();
                input.nextLine();
                if (bet < user.getMoney()) {
                    System.out.println("You don't have enough money to place a bet that large");
                }
            } while(bet < user.getMoney());

            user.setBet(bet);

            dealCards(user,computer);


            System.out.println(user.getName() + ", " + user.getHand().toString(false));
            System.out.println(computer.getName() + ", " + computer.getHand().toString(true));



            if (user.getHand().greaterThan21() == true) {
                System.out.print("You busted.");

            }
            else if (computer.getHand().greaterThan21() == true) {
                System.out.print("Computer busted.");
                win = true;
            }
            else if(computer.getHand().getHandValue() < user.getHand().getHandValue()) {
                System.out.println("You win!");
                win = true;
            }
            else if (computer.getHand().getHandValue() == user.getHand().getHandValue()) {
                System.out.println("Split pot");
                split = true;
            }
            else {
                System.out.println("You lose");
            }

            if (win) {
                user.setMoney(user.getMoney() + user.getBet());
            }
            else if (split) {
                continue;
            }

            else {
                user.setMoney(user.getMoney() - user.getBet());
            }

            if (user.getMoney() <= 0 ) {

                System.out.println("You don't have any money left to play another game.");
                break;

            }

            System.out.print("Would you like to play again? y or n ");
            System.out.print("Current Bankroll: " + user.getMoney());

            if (input.next().equals("n")) {
                break;
            }

        }



        System.out.println("Thanks for playing");















    }

    public static void dealCards(Player user, Player computer) {

        Scanner input = new Scanner(System.in);


        Boolean check = false;

        Deck deck = new Deck();

        user.getHand().resetCards();
        computer.getHand().resetCards();

        deck.deal(user);
        deck.deal(computer);

        deck.deal(user);
        deck.deal(computer);

        System.out.println(user.getName() + ", " + user.getHand().toString());

        System.out.println(computer.getName() + ", " + computer.getHand().toString());


        while (check == false && user.getHand().greaterThan21() == false) {
            System.out.print("Another card? y or n: ");
            if (input.next().equals("y")) {
                    deck.deal(user);
                    System.out.println(user.getName() + ", " + user.getHand().toString(false));
                } else {
                    check = true;
                }
            }

        while (computer.computerAI()) {
            deck.deal(computer);
        }



    }
}
