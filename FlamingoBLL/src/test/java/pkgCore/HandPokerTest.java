 package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eHandStrength;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class HandPokerTest {
	@Test
	public void ThreeOfAKind() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SIX));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES, eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.KING));
		hp.ScoreHand();
		assertEquals(hp.ISThreeOfAKind(), true);
	}
	
	
	

	@Test
	public void testRoyalFlush() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.QUEEN));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.JACK));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.TEN));
		hp.ScoreHand();
		assertEquals(hp.ISRoyalFlush(), true);
	}

	

	@Test
	public void FourOfAKind() {

		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SIX));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES, eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.ISFourOfAKind(), true);
	}

	@Test
	public void FullHouse() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.KING));
		hp.AddCard(new Card(eSuit.SPADES, eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.ACE));
		hp.ScoreHand();
		assertEquals(hp.ISFullHouse(), true);
	}

	@Test
	public void Flush() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS, eRank.JACK));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.TEN));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SEVEN));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.ISFlush(), true);

	}

	@Test
	public void Straight() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SEVEN));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.EIGHT));
		hp.AddCard(new Card(eSuit.SPADES, eRank.NINE));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.TEN));
		hp.ScoreHand();
		assertEquals(hp.ISStraight(),true);
	}

	

	

	@Test
		public void OnePair() {
			HandPoker hp = new HandPoker();
			hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
			hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
			hp.AddCard(new Card(eSuit.DIAMONDS,eRank.JACK));
			hp.AddCard(new Card(eSuit.SPADES,eRank.KING));
			hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
			hp.ScoreHand();
			assertEquals(hp.ISPair(),true);
	}
	@Test
	public void HighCard() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.JACK));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.TEN));
		hp.AddCard(new Card(eSuit.SPADES, eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.ISHighCard(), true);
	}
	
	@Test
	public void TwoPair() {
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS, eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS, eRank.ACE));
		hp.AddCard(new Card(eSuit.SPADES, eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS, eRank.QUEEN));
		hp.ScoreHand();
	}
	@Test
	public void IsStraightFlush() {

		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.SEVEN));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.EIGHT));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.NINE));
		hp.AddCard(new Card(eSuit.HEARTS, eRank.TEN));
		hp.ScoreHand();
		assertEquals(hp.ISStraight(), true);
	}
}