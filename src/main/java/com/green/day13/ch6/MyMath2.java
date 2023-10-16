package com.green.day13.ch6;
// 인스턴스가 되어야만 하니까 인스턴스 맴버라고 부릅니다.
// 실무에선 클래스변수를 자주 사용하진 않습니다.
public class MyMath2 {
    int num;
    static int staticNum; // 클래스영역에 statc이 들어갑니다. static붙은 애들은 공간이 하나입니다.


    static void print(){
        System.out.printf("staticNum : %d\n", staticNum); // 같은 공간에 있을 때 MyMath2를 생략가능 합니다.
        // System.out.println(num); // 사용 할 수 없습니다.
        // num 은 문서로, 객체화가 될 때 할당이되기에 사용할 수 없습니다.
        // 매서드 내에서 인스턴스 변수를 사용하지 않기에 static을 붙이는 것을 고려합니다.

    }
    void print2(){
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);
    }
    static void setStaticAbs(int n){
        System.out.println(n < 0 ? -n : n);
    }
    // 파라미터 내의 내용물만 사용할 때 static을 붙입니다.
}