package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {

    char[] suitList = new char[]{'♠', '♦', '♥', '♣'};

    char suit;

    int cardValue;

    public Card(int suit, int cardValue) {
        this.suit = this.suitList[suit];
        this.cardValue = cardValue;
    }



    public char[] getSuitList() {
        return suitList;
    }

    public void setSuitList(char[] suitList) {
        this.suitList = suitList;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {

        if(cardValue == 1){
            return 11;
        } else if(cardValue > 1 && cardValue < 10){
            return cardValue;
        } else {
            return 10;
        }

    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suitList=" + Arrays.toString(suitList) +
                ", suit=" + suit +
                ", cardValue=" + cardValue +
                '}';
    }
}
