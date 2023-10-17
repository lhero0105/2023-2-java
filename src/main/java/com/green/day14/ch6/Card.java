package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;
    // 전역변수는 클래스가 사라지지 않으면 살아있습니다.
    // 생성자 자동생성 - 해당 위치우클릭 generate 생성자
    void printMySelf(){
        System.out.printf("%s (%s)\n", pattern, denomination);
    }
    public Card(String pattern, String denomination){
        this.pattern = pattern; // 지역변수와 전역변수의 이름이 같을 때 가까운 곳을 사용 > this사용
        this.denomination = denomination;
    }
}
