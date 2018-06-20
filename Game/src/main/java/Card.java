public class Card {

    private SuitsType suits;
    private RankType rank;

    public Card(SuitsType suits, RankType rank) {
        this.suits = suits;
        this.rank = rank;
    }

    public SuitsType getSuits() {
        return suits;
    }

    public RankType getRank() {
        return rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }

    public String niceName() {
        return (getRank() + " of " + getSuits());
    }
}
