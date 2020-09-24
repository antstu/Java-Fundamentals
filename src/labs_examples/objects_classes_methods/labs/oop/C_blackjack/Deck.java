package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards = new ArrayList<Integer>();;

    public Deck() {

        cards = new Card[52];
        int cardCt = 0;
        for(int suit = 0; suit<=3; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[cardCt] = new Card(suit, value);
                cardCt++;
            }
        }

    }

//    public void shuffle() {
//        for (int i = 51; i > 0; i-- ) {
//            int rand = (int) (Math.random()*(i+1));
//            Card temp = cards[i];
//            cards[i] = cards[rand];
//            cards[rand] = temp;
//        }
//
//        usedCards = new ArrayList<Integer>();
//    }

    public void deal(Player player) {

        int rand = (int) (Math.random()*(52));

        if(usedCards.contains(rand)){
            do{
                rand = (int)(Math.random() * 52);
            } while (usedCards.contains(rand));
        }

        Card card = cards[rand];

        Hand currentHand = player.getHand();
        System.out.println("adding cards");

        currentHand.addCard(card);

        System.out.println("here");



        usedCards.add(rand);





    }


    public boolean isCardUsed(int value) {
        if (usedCards.contains(value)){
            return true;

        }
        else {
            return false;
        }
    }








        public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
