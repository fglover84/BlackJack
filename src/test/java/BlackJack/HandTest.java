/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardSuitEnum;
import Enum.CardValueEnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fionaglover
 */
public class HandTest {

    static Dealer dealer;

    public HandTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @BeforeEach
    public void setUp() {
        dealer = new Dealer();
    }

    @AfterEach
    public void tearDown() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addCard method, of class Hand.
     * 
     * New card added to players hand
     */
    @Test
    public void testAddCard() {
        System.out.println("Testing addCard");

        Player player = dealer.getPlayer();
        System.out.println("Players hand is empty: " + player.getHand().getCards().isEmpty());
        Card card = dealer.getDeck().getNextCard();
        System.out.println("Adding card: " + card);
        player.getHand().addCard(card);
        System.out.println("Hand contains: " + player.getHand().getCards());
        assertTrue(!player.getHand().getCards().isEmpty());
    }

    /**
     * Test of calculateScore method, of class Hand.
     * UC6 Calculate score/Scenario 6
     * 
     * Each time a new card is added to a players’ hand the score for that hand
     * should be calculated.
     * 
     * The hand contains two cards: a King and an Ace
     * 
     * The score calculated equals 21
     */
    @Test
    public void testCalculateScoreKingAndAce() {
        System.out.println("Test calculateScoreKingAndAce");
        Hand hand = new Hand();
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfSpades.png");
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        hand.addCard(kingOfHearts);
        hand.addCard(aceOfSpades);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score should be 21");
        assertTrue(hand.getScore() == 21);
        System.out.println("----------------------------------");

    }

    /**
     * Test of calculateScore method, of class Hand.
     * UC6 Calculate score/Scenario 6
     * 
     * Each time a new card is added to a players’ hand the score for that hand
     * should be calculated.
     * 
     * The hand contains two cards: a King and an Ace
     * 
     * The score calculated equals 21
     */
    @Test
    public void testCalculateScoreAceAndKing() {
        System.out.println("Test calculateScoreAceAndKing");
        Hand hand = new Hand();
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfSpades.png");
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score should be 21");
        assertTrue(hand.getScore() == 21);
        System.out.println("----------------------------------");

    }

    /**
     * Test of calculateScore method, of class Hand.
     * UC6 Calculate score/Scenario 7
     * 
     * Each time a new card is added to a players’ hand the score for that hand
     * should be calculated.
     * 
     * The hand contains three cards: a King, Queen and an Ace
     * 
     * The score calculated equals 21
     */
    @Test
    public void testCalculateScoreKingQueenAce() {
        System.out.println("Test calculateScoreKingQueenAce");
        Hand hand = new Hand();
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        Card queenOfHearts = new Card(CardValueEnum.QUEEN, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/QueenOfHearts.png");
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfSpades.png");
        hand.addCard(kingOfHearts);
        hand.addCard(queenOfHearts);
        hand.addCard(aceOfSpades);

        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score should be 21");
        assertTrue(hand.getScore() == 21);
        System.out.println("----------------------------------");

    }

    /**
     * Test of calculateScore method, of class Hand.
     * UC6 Calculate score/Scenario 8
     * 
     * Each time a new card is added to a players’ hand the score for that hand
     * should be calculated.
     * 
     * The hand contains three cards: a Nine, Ace and another Ace
     * 
     * The score calculated equals 21
     */
    @Test
    public void testCalculateScoreNineAceAce() {
        System.out.println("Test calculateScoreNineAceAce");
        Hand hand = new Hand();
        Card nineOfHearts = new Card(CardValueEnum.NINE, CardSuitEnum.HEARTS,
                "./BlackJack/src/main/resources/images/NineOfHearts.png");
        Card aceOfHearts = new Card(CardValueEnum.ACE, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfHearts.png");
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfSpades.png");
        // Hand value is calculated when card is added to the hand
        hand.addCard(nineOfHearts);
        hand.addCard(aceOfHearts);
        hand.addCard(aceOfSpades);

        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score should be 21");
        assertTrue(hand.getScore() == 21);
        System.out.println("----------------------------------");

    }

    /**
     * Test of evaluateScore method, of class Hand.
     * UC7 Evaluate score/Scenario 4a
     * 
     * When a score is evaluated, true is returned for values less than or
     * equal to 21 and false returned for values more than or equal to 22
     * 
     * The hand contains two cards: a King and an Ace
     * 
     * The score calculated equals 21 and is therefore valid and should return
     * true
     */
    @Test
    public void testEvaluateScoreKingAndAce() {
        System.out.println("Test evaluateScoreKingAndAce");
        Hand hand = new Hand();
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        Card aceOfHearts = new Card(CardValueEnum.ACE, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/AceOfHearts.png");
        hand.addCard(kingOfHearts);
        hand.addCard(aceOfHearts);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score is valid: " + hand.evaluateScore());
        System.out.println("Score should be <=21 and valid");
        System.out.println("Hand is complete: " + hand.isComplete());
        assertTrue(hand.evaluateScore() == 1 && hand.isComplete());
        System.out.println("----------------------------------");

    }

    /**
     * Test of evaluateScore method, of class Hand.
     * UC7 Evaluate score/Scenario 4b
     * 
     * When a score is evaluated, true is returned for values less than or
     * equal to 21 and false returned for values more than or equal to 22
     * Hand is complete is value is >= 21
     * 
     * The hand contains two cards: a King and an Eight
     * 
     * The score calculated equals 18 and is therefore valid and should return
     * true
     */
    @Test
    public void testEvaluateScoreKingAndEight() {
        System.out.println("Test evaluateScoreKingAndEight");
        Hand hand = new Hand();
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        Card eightOfHearts = new Card(CardValueEnum.EIGHT, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/EightOfHearts.png");
        hand.addCard(kingOfHearts);
        hand.addCard(eightOfHearts);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score is valid: " + hand.evaluateScore());
        System.out.println("Score should be <=21 and valid");
        System.out.println("Hand is complete: " + hand.isComplete());
        assertTrue(hand.evaluateScore() == 0 && !hand.isComplete());
        System.out.println("----------------------------------");

    }

    /**
     * Test of evaluateScore method, of class Hand.
     * UC7 Evaluate score/Scenario 4c
     * 
     * When a score is evaluated, true is returned for values less than or
     * equal to 21 and false returned for values more than or equal to 22
     * Hand is complete is value is >= 21
     * 
     * The hand contains two cards: a King and an Eight
     * 
     * The score calculated equals 21 and is therefore valid and should return
     * true and hand should be complete
     */
    @Test
    public void testEvaluateScoreKingAndEightAndThree() {
        System.out.println("Test evaluateScoreKingAndEightAndThree");
        Hand hand = new Hand();
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        Card eightOfHearts = new Card(CardValueEnum.EIGHT, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/EightOfHearts.png");
        Card threeOfHearts = new Card(CardValueEnum.THREE, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/EightOfHearts.png");

        hand.addCard(kingOfHearts);
        hand.addCard(eightOfHearts);
        hand.addCard(threeOfHearts);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score is valid: " + hand.evaluateScore());
        System.out.println("Score should be <=21 and valid");
        System.out.println("Hand is complete: " + hand.isComplete());
        assertTrue(hand.evaluateScore() == 0 && hand.isComplete());
        System.out.println("----------------------------------");

    }

    /**
     * Test of evaluateScore method, of class Hand.
     * UC7 Evaluate score/Scenario 5
     * 
     * When a score is evaluated, true is returned for values less than or
     * equal to 21 and false returned for values more than or equal to 22
     * Hand is complete is value is >= 21
     * 
     * The hand contains two cards: a King, Queen and Eight
     * 
     * The score calculated equals 28 and is therefore invalid and should return
     * false and hand is complete
     */
    @Test
    public void testEvaluateScoreKingQueenAndEight() {
        System.out.println("Test evaluateScoreKingQueenAndEight");
        Hand hand = new Hand();
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/KingOfHearts.png");
        Card queenOfHearts = new Card(CardValueEnum.QUEEN, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/QueenOfHearts.png");
        Card eightOfHearts = new Card(CardValueEnum.EIGHT, CardSuitEnum.HEARTS,
                "../../../main/java/BlackJack/src/main/resources/images/EightOfHearts.png");
        hand.addCard(kingOfHearts);
        hand.addCard(queenOfHearts);
        hand.addCard(eightOfHearts);
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + hand.getScore());
        System.out.println("Score is valid: " + hand.evaluateScore());
        System.out.println("Score should be <=21 and valid");
        System.out.println("Hand is complete: " + hand.isComplete());
        assertTrue(hand.evaluateScore() == -1 && hand.isComplete());
        System.out.println("----------------------------------");

    }

}
