package com.green.prvfile;
class Card4{
    String number;
    String kind;
    void PrintSelf(){
        System.out.printf("%s - %s\n", kind, number);
    }
}
public class CardTest2_3 {
    public static void main(String[] args) {// 1. 카드를 만든다 2. 출력한다
        Card4 c = new Card4();
        Card4[] card4 = MakeCard();
        for (Card4 cards: card4) {
            cards.PrintSelf();
        }
    }
    static Card4[] MakeCard(){
        int cnt = 0;
        Card4[] arr = new Card4[52];
        String[] kind = {"Heart", "Diamond", "Space", "Club"};
        for (int i = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card4 card4 = new Card4();
                String number = getNumberFromInt(j);
                card4.number = number;
                card4.kind = kind[i];
                arr[cnt++] = card4;
            }
        }
        return arr;
    }
    static String getNumberFromInt(int j){
        String num = Integer.toString(j);
        switch (j){
            case 1:  return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            default: return num;
        }
    }
}
