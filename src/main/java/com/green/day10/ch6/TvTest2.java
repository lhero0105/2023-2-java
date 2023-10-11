package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        /*
        스택 - Tv tv1, Tv tv2
        힙 - tv, channel-color, 메소드들
        0x1111로 주솟값이 스택의 변수와 힙의 애들이 같을 때 스택애들이 힙애들을 가르키게 됩니다.
         */
        System.out.printf("tv1.channel : %d\n", tv1.channel);

        tv1.channelup();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);
    }
}
