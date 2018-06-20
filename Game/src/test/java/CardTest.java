import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
      card = new Card(SuitsType.CLUBS, RankType.EIGHT);
    }

    @Test
    public void testCardHasSuit(){
        assertEquals(SuitsType.CLUBS, this.card.getSuits());
    }

    @Test
    public void testCardHasRank(){
        assertEquals(RankType.EIGHT, this.card.getRank());
    }

    @Test
    public void testCardHasValue() {
        assertEquals(8, this.card.getValueFromEnum());
    }

    @Test
    public void testCardHasAName(){
        assertEquals("EIGHT of CLUBS", this.card.niceName());
    }
    
}
