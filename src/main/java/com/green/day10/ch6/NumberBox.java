package com.green.day10.ch6;
// 값을 호출하는 부분에서 정의를 하면 안됩니다.
// 클래스와 객체의 이해
// 클래스 설명서이며 만들어진 객체는 설명서 대로 동작합니다.
public class NumberBox {
    // 리턴타입 매서드 매게변수(아규먼트, 파라미터)
    // 매소드가 다른 매소드를 가질 수 없습니다. ex) void sum(){ void minus (){} } X
    void sum(int n1, int n2){ // 매소드 정의
        //   int n1, n2 안됩니다. 타입이 중요하므로
        //맴머필드 속성 프로퍼티 위치
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }
    void minus(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
    void abs(int n1){
        if(n1<0){ n1 *= -1; }
        System.out.println(n1);
    }


}
