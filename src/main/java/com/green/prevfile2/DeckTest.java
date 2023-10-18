package com.green.prevfile2;

class Card{
    //상수는 값을 변경할 수 없는 변수이다. 리터럴은 고정값을 나타내는 표기법
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬 별 카드 수
    // static 생각 순서 -객체화 x > 메모리에 바로 올라갑니다.

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLUVER = 1;
    int kind;
    int number;
    Card(){
        this(SPADE, 1);
    }
    @Override
    public String toString(){
        return String.format("kind : %d, number : %d", kind, number);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }



}
class Deck{
    Card c = new Card();
    final int Card_NUM = 52;

    Card[] cardArr = new Card[Card_NUM];
    Deck(){
        int cnt = 0;
        int[] kinds = {c.SPADE, c.DIAMOND, c.HEART, c.CLUVER};
        for (int i = 0; i < kinds.length; i++) {
            int kind = kinds[i];
            for (int j = 1; j <= 13; j++) {
                int number = j;
                cardArr[cnt++] = new Card(kind,number);
            }
        }
    }
    Card pick(int num){
        return cardArr[num];
    }
    Card pick(){
        int num = (int)(Math.random()*Card_NUM);
        return cardArr[num];
    }



}
public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c1 = deck.pick(20);
        System.out.println(c1);
        Card c2 = deck.pick();
        System.out.println(c2);


        System.out.println(c2.toString());
        System.out.println(c2);


        /*Card c = new Card(4,7);
        System.out.printf("c.kind : %d, number : %d\n", c.kind, c.number);// 4 1
        Card c2 = new Card(Card.HEART, 3); // 클래스이름. 나오면 무조건 스태틱인걸 알아야합니다.
        System.out.printf("c.kind : %d, number : %d\n", c2.kind, c2.number);// 2 3

        System.out.println(c2.toString()); // 4 7
        System.out.println(c2);
        System.out.println(c2 + "dd"); // c2.toString() 참조타입을 String으로 변환
        // toString은 String을 오버라이딩 한 것입니다.

        // @Override //이노테이션 - 오버라이딩이 됬다고 증명해줍니다.
        // 기입 시 오버라이딩 했는지를 알려줍니다.*/
    }
}
