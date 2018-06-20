import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void testDeckHas52Cards(){
        deck.generateDeck();
        assertEquals(52, this.deck.cardsCounter());
    }



}
