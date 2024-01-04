package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf = () -> {
            System.out.println("안녕하세요");
            System.out.println("안녕하세요");
        };
        // 한 문장으로 익명클래스를 간소화 시킬 수 있습니다 -> 람다표현식
    }
}
