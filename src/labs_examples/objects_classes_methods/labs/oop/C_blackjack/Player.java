package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    private String name;
    private Hand hand;
    private int potValue;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }



    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        this.hand = new Hand();
    }

    public boolean computerAI(Player computerPlayer){
        if(computerPlayer.getHand().getHandValue() < 16)
            return true; //true if the computer player wants another card, If the computer player's hand currently has a value less than 16

        return false; //false is the computer player does not want another card
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
