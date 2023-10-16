package com.green.prvfile;

import com.green.day12.ch6.Card;

class Card3{
    String number;
    String kind;
    void print(){
        System.out.printf("%s - %s\n", kind, number);
    }
}
public class CardTest2_2 {
    public static void main(String[] args) {
        Card3 card3 = new Card3();
        Card3[] cards = makeCards();
        for (Card3 c: cards) {
            c.print();
        }
    }
    static Card3[] makeCards(){
        Card3[] Arr = new Card3[52];
        int cnt = 0;
        String[] kind = {"Heart", "Club", "Diamond", "Space"};
        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card3 c = new Card3();
                c.number = getNumberFromInt(j);
                c.kind = kind[i];
                Arr[cnt++] = c;
            }
        }
        return Arr;
    }
    static String getNumberFromInt(int j){
        String num = Integer.toString(j);
        switch (j){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return num;
        }
    }
}
