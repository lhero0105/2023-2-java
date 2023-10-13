package com.green.day10.ch6;

public class Tv {
    // 속성 (맴버필드)
    String color;
    boolean power;
    int channel;
    // 매서드

    // void - retune 타입 타입x
    // 리턴타입 매소드명 파라미터는 무조건 있습니다.
    void power() { power = !power;} // 선언부, {}구현부
    // 매소드 정의 <> power() : 매소드 호출
    void channelup() { channel++; } // { this.channel++; } this상수(참조변수)가 자동으로 입력됩니다.
    void channeldown() { channel--; }
}
