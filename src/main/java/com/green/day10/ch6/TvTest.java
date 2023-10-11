package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
        // Tv tv3 = str; error 다른타입을 담기에

        Tv tv1 = new Tv(); // Tv1 - 참조형 타입의 주솟값을 담을 수 있습니다.
        tv1.channel = 10;
        tv1.power = true; // 불린형은 디폴트값이 false?
        tv1.color = "빨간색";

        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.println("tv1 == tv2 >> " + (tv1 == tv2));

        System.out.println("Tv1.channel : " + tv1.channel);
        System.out.println("Tv1.power : " + tv1.power);
        System.out.println("Tv1.color : " + tv1.color);

        System.out.println("----------------------------");

        System.out.println("Tv2.channel : " + tv2.channel);
        System.out.println("Tv2.power : " + tv2.power);
        System.out.println("Tv2.color : " + tv2.color);
    }
}
