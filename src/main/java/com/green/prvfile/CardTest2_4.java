package com.green.prvfile;

class Card5{
    String kind;
    String number;
//    void SelfPrint(){
//        System.out.printf("%s - %s\n", kind, number);
//    }
}
public class CardTest2_4 {
    public static void main(String[] args) {
        Card5[] c = MakeCard();
//        for (Card5 cards: c) {
//            cards.SelfPrint();
//        }
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%s - %s\n", c[i].kind, c[i].number);
        }
    }

    static Card5[] MakeCard(){
        int cnt = 0;
        Card5[] cards = new  Card5[52];
        String[] kind = {"Heart", "Space", "Club", "Diamond"};
        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card5 c = new Card5();
                String num = getMakeFrom(j);
                c.number = num;
                c.kind = kind[i];
                cards[cnt++] = c;
            }
        }
        return cards;
    }
    static String getMakeFrom(int j){
        String num = Integer.toString(j);
        switch (j){
            case 1:return "A";case 11:
                return "B";   case 12:
                return "C";   case 13:
                return "D";default:
                return num;
        }
    }
}
