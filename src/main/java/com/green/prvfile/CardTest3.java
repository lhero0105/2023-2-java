package com.green.prvfile;

import com.green.day14.ch6.Card;

class Card33{
     String kind;
     String number;
     Card33(String kind, String number){
         this.kind = kind;
         this.number = number;
     }
}
public class CardTest3 {
    public static void main(String[] args) {
        //Card2 c = new Card2();
        Card33[] cards = makeCards();
        //Card[] cards2 = makeCards(); // cards 와 cards2는 다른 존재입니다.


    }
    public static Card33[] makeCards(){
        int cnt = 0;
        Card33[] card33s = new Card33[52];
        String[] kinds = {"Heart", "Diamond", "Club", "Space"};
        for (int i = 0; i < kinds.length; i++) {
            String kind = kinds[i];
            for (int j = 1; j <= 13; j++) {
                String num = CardFromTo(j);
                card33s[cnt++] = new Card33(kind, num);

            }
        }
        return card33s;
    }
    static String CardFromTo(int j){//문제없음

        switch (j){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(j);
    }
}