package com.champlain.oop2assignment3;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare by Rank first
        int rankComparison = card1.getRank().compareTo(card2.getRank());

        // If the ranks are the same, compare by Suit
        if (rankComparison != 0) {
            return rankComparison;
        } else {
            return card1.getSuit().compareTo(card2.getSuit());
        }
    }
}