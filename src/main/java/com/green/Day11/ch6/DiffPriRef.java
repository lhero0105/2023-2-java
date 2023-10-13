package com.green.Day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        // static은 그 즉시 메모리상에 올라갑니다.
        int num = 30;
        changeVal(num);
        System.out.println("num : " + num); // 30

        NumBox nb = new NumBox(); // 주솟값의 의미 - 객체한테 접근할 수 있는 정보
        nb.num = 30; // "가르킨다"의 의미 언제든지 접근할 수 있다
        changeVal(nb); //오버로딩된 매서드 중 타입이나 갯수가 같은것으로
        System.out.println("num : " + nb.num);
    }
    public static void changeVal(int val){ // 원시타입
        System.out.println("changeVal - int");
        val = 10;
    }
    public static void changeVal(NumBox nb2){ // 참조타입 nb와 nb2는 stack의 다른 영역에 생성되지만 같은 주솟값을 가지게 됩니다.
        // nb2 = new NumBox(); //새로운 객체 생성하므로 주솟값 변경 > 이전 데이터는 G.C로 이동
        System.out.println("changeVal - NumBox");
        nb2.num = 10;
        // nb2 = new NumBox(); // 생각해보기
    }
}
class NumBox{
    int num;
}
