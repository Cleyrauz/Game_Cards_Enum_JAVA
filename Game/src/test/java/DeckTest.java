import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
       deck = new Deck();
    }

    @Test
    public void testDeckStartsEmpty(){
        assertEquals(0, this.deck.cardsCounter());
    }



}
