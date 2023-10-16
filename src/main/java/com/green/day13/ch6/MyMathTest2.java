package com.green.day13.ch6;
// static 은 객체생성과는 별개로 매서드영역(클래스영역, static영역)에 메모리가 올라가기에 객체생성이 필요 없습니다.
// 클래스 매서드나 맴버필드는 클래스를 적어 사용합니다.
// 스태틱매서드가 인스턴스매서드 호출 ? x
public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30;
        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("mm2_2.num = %d, staticNum = %d\n", mm2_2.num, mm2_2.staticNum); // 이동시켜가며 비교해봅시다
        System.out.printf("mm2.num = %d, staticNum = %d\n", mm2.num, mm2.staticNum);

        System.out.printf("MyMath2.staticNum = %d\n", MyMath2.staticNum); // 위 예제는 static설명을 위해 쓴 것이지 원래는 클래스 이름으로 접근해야 합니다.
    }
}
