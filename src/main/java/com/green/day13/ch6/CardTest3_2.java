/*
package com.green.day13.ch6;

class Card2 {
    String pattern;  // Spade, Heart, Diamond, Club
    String denomination;  // A, 2~10, J, Q, K

    Card2(){}
    Card2(String pattern, String denomination) {
        this.pattern=pattern;
        this.denomination= denomination;
    }

    void printYourself() {
        System.out.printf("%s- %s\n", pattern, denomination);
    }
}

public class CardTest3_2 {
    public static void main(String[] args) {
        Card[] cards= makeCards();
        System.out.println(cards.length);
        for(Card2 c: cards) {
            c.printYourself();
        }
    }

    public static Card[] makeCards() {
        Card[] cards= new Card[52];
        String[] p= {"Spade", "Heart", "Diamond", "Club"};
        String[] d= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int cnt= 0;
        for(int i= 0; i<p.length; i++) {
            for(int z= 0; z<d.length; z++) {
                cards[cnt++]= new Card(p[i],d[z]);
            }
        }
        return cards;
    }
}
*/
