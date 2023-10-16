package com.green.day13.ch6;

import com.green.day12.ch6.Card;


public class CardTest2 {
    public static void main(String[] args) {
        //Card c = new Card(); // import
        Card[] cards = makeCards();
        //Card[] cards2 = makeCards(); // cards 와 cards2는 다른 존재입니다.
        System.out.println(cards.length);

        for (Card c: cards) { // Card[]타입의 cards 배열을 Card타입의 c에 주솟값 저장
            c.printYourSelf(); // spade(A), Heart(2)
        }
    }

    public static Card[] makeCards(){
        Card[] cards = new Card[52];
        //Card c1 = new Card();
        //c1.kind = "Spade";
        //c1.number = "A";
        //Card c2 = new Card();
        //c2.kind = "Spade";
        //c2.number = "A";

        String[] kind = { "Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = getNumberFromInt(j);
                Card c = new Card();
                c.kind = kind[i];
                c.number = number;
                // cards[(i*13) + (j-1)] = c;
                cards[cnt++] = c;
            }
        }
        // Spade, heart, Diamond, club // 각각 13장
        // A, 2~10, J, Q, K
        return cards;
    }
    public static String getNumberFromInt(int j){
        String num = Integer.toString(j);
        if(j >=2 && j <= 10){
            return num;
        }else if(j == 1){
            return "A";
        }else if(j == 11){
            return "J";
        }else if(j == 12){
            return "Q";
        }else if(j == 13){
            return "K";
        }
        return "";
    }
}
