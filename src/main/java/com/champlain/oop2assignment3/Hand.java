package com.champlain.oop2assignment3;

import java.util.*;

/**
 * Represents a hand of playing cards.
 * <p>
 * This class allows for adding cards to the hand and checking if the hand is empty.
 * It also provides an iterator to traverse the cards in the hand.
 * </p>
 */
public class Hand extends CardCollection implements ScoringStrategy {
    /**
     * The list of cards in this hand.
     */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Adds a card to this hand.
     *
     * @param pCard the card to be added
     */
    public void addCard(Card pCard) {
        this.aCards.add(pCard);
    }

    /**
     * Checks if this hand is empty.
     *
     * @return true if the hand has no cards, false otherwise
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this hand.
     *
     * @return an iterator for the cards
     */
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    @Override
    public int calculateScore(CardCollection pCards, String pChoice) {
        int count = 0;
        if (isEmpty())
            return 0;
        else
            if (Objects.equals(pChoice, "Simple Count"))
                return this.aCards.size();
            else
                /*
                Iterates through the ArrayList aCards of Hand, and counts how many
                of said cards include the rank ACE.
                 */
                for (Card card : aCards) {
                    if (Objects.equals(card.getRank().toString(), "ACE"))
                        count++;
                }
                return count;
    }
}
