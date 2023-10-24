package com.green.day19.ch7;
// 인터페이스 맴버필드는 public static final이 자동 기입 됩니다.(생략가능)
// 모든 매서드는 public abstract를 생략해도됩니다.
// 마우스 올려서 implements매서드 생성합니다.

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1; // public static final 생략

    public abstract String getCardNumber();
    String getCardKind(); // public abstract 생략
}

interface PlayingChess extends PlayingCard{ // 인터페이스 끼리 상속은 extend를 사용,
    void moveHores(int x, int y);
}
class chess implements PlayingChess{ // 상속받은 추상매서드도 구현해야합니다

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHores(int x, int y) {

    }
}
class Card implements PlayingCard{

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}
class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}