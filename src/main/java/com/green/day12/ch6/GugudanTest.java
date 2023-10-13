package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan Gugudan = new Gugudan();
        Gugudan.print(4); // 4단 구구단 콘솔에 ㅊㄹ력
        /*
        4 x 1 = 4
        4 x 2 = 8
        ...
        4 x 9 = 36
         */
        Gugudan.print(5);

        Gugudan.printFromTo(4,7);
        Gugudan.printFromTo(3,4);

        System.out.println("=====================");

        Gugudan.printFromTo(3, 6, "-----");// 세퍼레이터(구분자)
    }
}