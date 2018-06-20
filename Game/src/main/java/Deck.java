import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
      cards = new ArrayList();
    }

    public int cardsCounter(){
        return this.cards.size();
    }

}
