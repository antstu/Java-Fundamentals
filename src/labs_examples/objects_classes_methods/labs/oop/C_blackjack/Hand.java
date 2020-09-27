package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;


    public void resetCards() {
        cards = new ArrayList<>();
        handValue = 0;
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
        }

    }


    public int getHandValue() {
        int score = 0;
        for (Card c: cards) {
            score  += c.getCardValue();
        }

        return score;
    }



//    @Override
//    why is override not working?
    public String toString(Boolean hidden) {
        StringBuilder sb = new StringBuilder();

        if (hidden) {
            sb.append(cards.get(0).toString());
        }
        else {
            for( Card c: cards) {
                sb.append(c.toString());
                sb.append(" ");
            }
            sb.append("\n");
            sb.append("score = ").append(getHandValue());
        }

        return sb.toString();
    }
}
