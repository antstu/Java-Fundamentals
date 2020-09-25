package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;



    public int returnScore() {

        return handValue;

    }

    public boolean greaterThan21(){
        if(handValue > 21)
            return true;
        else
            return false;
    }

    public void addCard(Card card) {

        handValue = 0;

        cards.add(card);

        for(Card c: cards) {
            handValue += c.getCardValue();
            System.out.println("Hand Value is ");
            System.out.println(handValue);
        }

    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return returnScore();
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
