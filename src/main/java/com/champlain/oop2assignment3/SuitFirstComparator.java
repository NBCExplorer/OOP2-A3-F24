package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 *
 *
 */
public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare by Suit first
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());

        // If the suits are the same, compare by Rank
        if (suitComparison != 0) {
            return suitComparison;
        } else {
            return card1.getRank().compareTo(card2.getRank());
        }
    }
}