package com.green.day14.ch6;
// private - 같은 클래스 내 에서만 호출 가능 합니다,

// 기본 순서입니다.
// 맴버필드
// 생성자
// 매소드
public class CardDeck {
    Card[] cards; // **선언을 전역변수에 해야 사라지지 않습니다. 지도를 잊어버리면 집에 못찾아오지요
    public CardDeck(){
        init();
    }
    public void init(){
        cards = new Card[52];

        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int j = 1; j <= 13; j++) {
                String denomination = this.getNumberFromInt(j);
                cards[idx++]= new Card(pattern, denomination);
            }
        }
    }
    private String getNumberFromInt(int j){
        String num = Integer.toString(j);
        switch (j){
            case 1:  return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            default: return num;
        }
    }
    void printAll(){
        for (Card c:cards) { // 순차적으로 받아오면 명령 내릴 수 있습니다.
            System.out.printf("%s (%s)\n", c.pattern, c.denomination);
        }
    }
    // 카드 주솟값 52개 중 하나를 c1에 담고 호출할때마다 다른주솟값, 넘겨주면 지웁니다.
    // 호출할때마다 랜덤하게
    // 랜덤 5번방을 주면 null
    // 또 5번이면 null인데 그러면 안되고 무조건 주솟값이 넘어와야합니다. > 다른 랜덤한 방을 찾아야합니다.
    public Card getCard(){
        Card c =null;
        while (true){
            int rIdx= (int)(Math.random()*cards.length);
            c = cards[rIdx];
            if(c != null){
                cards[rIdx] = null;
                break;
            }
        }

        return c;
    }
/*    public Card getCard(){
        Card c = null;
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random()*cards.length);
            c = cards[rIdx];
            if(c != null){
                cards[rIdx] = null;
                break;
            }
        }
        return c;
    }*/
}