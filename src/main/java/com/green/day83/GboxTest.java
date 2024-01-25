package com.green.day83;

public class GboxTest {
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.setItem(1);
        g1.setItem("우우우");

        Gbox<Integer> g2 = new Gbox<>();
        // 컴파일 시점에 타입 결정 <Integer>는 지워집니다.
        // g2.setItem("dd"); // 이제 문자열 안됨
        g2.setItem(1);
        g2.setItem(2);

        int intVal = g2.getItem();

        Gbox<String> g3 = new Gbox<>(); // 형변환을 안해도 되는 장점
        // g3.setItem(2); // 이제 정수열 안됨
        g3.setItem("하하하");
        String strVal = g3.getItem();
    }
}
