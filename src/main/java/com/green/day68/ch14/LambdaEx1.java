package com.green.day68.ch14;

@FunctionalInterface // 람다식 이용할 때 인터페이스는 메소드가 두개 있으면 안됩니다.
// 메소드가 하나만 있는지 검증해줍니다.
interface MyFunction{
    void run(int num1, int num2);
    // public abstrack 생략
    // 맴버필드는 final 생략

    // void match(); error 꼭 람다식 사용 시 메소드는 하나여야 합니다.
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = (i, i2) -> System.out.println("mf0 - run !!");
        MyFunction mf1 = new MyFunction() {
            // MyFunction을 객체화 한게 아닙니다.
            public void run(int i, int i2) {
                System.out.println(" fm2 - run !! ");
            }
        }; // 1. 익명 클래스
            // 장점 : 페키지 지저분함을 방지
        // 2. MyFunctionClass이라는 이름이 있는 클래스
        // 단점 : 이름 고민을 항상 해야합니다.
        MyFunction mf2 = new MyFunctionClass();
        mf0.run(1, 2);
    }
}
class MyFunctionClass implements MyFunction{
    public void run(int num1, int num2){
        System.out.println(" class name - run !! ");
    }
}