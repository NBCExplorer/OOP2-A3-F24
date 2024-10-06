package com.champlain.oop2assignment3;

/**
 * Represents the way a score is determined from a hand of cards.
 * There are two ways a score can be determined. (Simple count & Number of aces)
 */
public interface ScoringStrategy {

    /**
     * Determines the score of the player's hand by counter using either the Simple Count
     * strategy, or the Number of Aces strategy.
     * @param pCards The cards from the player's hand.
     * @param pChoice The scoring strategy chosen to be used.
     * @return The player's score.
     */
    int calculateScore(CardCollection pCards, String pChoice);
}
