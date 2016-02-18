import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DeckTest {
  @Test
  public void deck_initializesCorrectly_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck.getCards() instanceof ArrayList);
  }

  @Test
  public void randomeCards_true() {
    Deck testDeck = new Deck();
    ArrayList<Card> randomDeck = testDeck.getCards();
    assertEquals(true, randomDeck instanceof ArrayList);
  }

}
