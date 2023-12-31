package com.green.day15.ch7;

class Card{
    //상수는 값을 변경할 수 없는 변수이다. 리터럴은 고정값을 나타내는 표기법
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬 별 카드 수
    // static 생각 순서 -객체화 x > 메모리에 바로 올라갑니다.

    static final int SPADE = 4; // 다른 Class에서 Card.SPADE 로 객체화 x 사용
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
        //return "kind"+ this.kind + "num"+this.number;
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
        int idx = 0;
        int[] kind = {c.CLUVER, c.HEART, c.DIAMOND, c.SPADE};
        for (int i = 0; i < c.KIND_MAX; i++) {
            for (int j = 1; j <= c.NUM_MAX; j++) {
                int number = j;
                cardArr[idx++] = new Card(kind[i], number);
            }
        }
        for (Card c: cardArr) {
            System.out.println(c);
        }
    }
    Card pick(int idx){
        return cardArr[idx];
    }
    Card pick(){
        int rIdx = (int)(Math.random()*Card_NUM);
        return pick(rIdx);
    }
    void shuffle(){
        Card tmp = null;
        for (int i = 0; i < Card_NUM; i++) {
            int rIdx = (int)(Math.random()*Card_NUM); // 0~51
            tmp = pick(i);
            cardArr[i] = pick(rIdx);
            cardArr[rIdx] = tmp;
        }
        for ( Card c : cardArr ) {
            System.out.println(c);
        }
    }
}
public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c1 = deck.pick(20);
        deck.shuffle();







        /*Card c = new Card(4,7);
        System.out.printf("c.kind : %d, number : %d\n", c.kind, c.number);// 4 1
        Card c2 = new Card(Card.HEART, 3); // 클래스이름. 나오면 무조건 스태틱인걸 알아야합니다.
        System.out.printf("c.kind : %d, number : %d\n", c2.kind, c2.number);// 2 3

        System.out.println(c2.toString()); // 4 7
        System.out.println(c2);
        System.out.println(c2 + "dd"); // c2.toString() 참조타입을 String으로 변환
        // toString은 String을 오버라이딩 한 것입니다.

        // @Override //애노테이션 - 오버라이딩이 됬다고 증명해줍니다.
        // 기입 시 오버라이딩 했는지를 알려줍니다.*/
    }
}
