package com.green.day13.ch6;

import java.util.Arrays;

class Card{
    String pattern; // Spade, Heart
    String denomination; // A, 2~10, J, Q, K

    void printYourSelf(){
        System.out.printf("%s-%s\n", pattern, denomination); // 갖고 있는 변수
    }
}
public class CardTest3 {
    public static void main(String[] args) {
        Card[] cards = CardTest3.makeCards(); // 52개의 카드 배열을 답을 수 있는 매서드를 만듭니다
        System.out.println(cards.length);

        for (Card c: cards) {
            c.printYourSelf();
        }
/*        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].pattern + "-" + cards[i].denomination);
        }*/
    }
    public static Card[] makeCards(){
        Card[] cArr = new Card[52];
        int cnt = 0;
        String[] patterns = { "Spade", "Heart", "club", "Diamond"};
        for (int i = 0; i < cArr.length; i++) {
            String pattern = patterns[i / 13];
            String denomination = getNumberFromInt((i + 1) % 13 + 1);
            cArr[i] = new Card();
            cArr[i].pattern = pattern;
            cArr[i].denomination = denomination;

        }

        return cArr;
    }
    public static String getNumberFromInt(int j){
        String num = Integer.toString(j);
        if(j >= 2 && j <= 10){
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
