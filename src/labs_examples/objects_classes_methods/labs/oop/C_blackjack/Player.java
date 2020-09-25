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

    public boolean computerAI(){
        if(getHand().getHandValue() < 16) {
            System.out.println("Computer takes another card");
            return true;
        }

        System.out.println("Computer declines another card");
        return false;
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
