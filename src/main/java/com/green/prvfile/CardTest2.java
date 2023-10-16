package com.green.prvfile;

class Card2{
     String kind;
     String number;
}
public class CardTest2 {
    public static void main(String[] args) {
        //Card2 c = new Card2();
        Card2[] cards = makeCards();
        //Card[] cards2 = makeCards(); // cards 와 cards2는 다른 존재입니다.
       for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].kind + " - " + cards[i].number);
       }

    }
    public static Card2[] makeCards(){
        Card2[] Arr = new Card2[52];
        int cnt = 0;
        String[] kind = {"Space", "Heart", "Club", "Diamond"};

        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = CardFromTo(j);
                Card2 c = new Card2();
                c.kind = kind[i];
                c.number = number;

                Arr[cnt++] = c;
            }
        }
        return Arr;
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