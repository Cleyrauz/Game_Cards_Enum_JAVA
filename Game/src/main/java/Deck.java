import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
      cards = new ArrayList();
    }

    public int cardsCounter(){
        return this.cards.size();
    }

    public void generateDeck() {
        for (SuitsType suit : SuitsType.values()) {
            for (RankType rank : RankType.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

}
