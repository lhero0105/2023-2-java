package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if( x == 0) {
            System.out.println(" x == 0 ");
        }
        if( x != 0) {
            System.out.println(" x != 0 ");
        }
        // if (조건식이 true 일 때 {}를 실행합니다.)
        System.out.println("-------------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if( x == 0) {
            System.out.println(" x == 0 ");
        }
        if( x != 0) {
            System.out.println(" x != 0 ");
        }if( !(x == 0) ) {
            System.out.println(" x == 0 ");
        }
        if( !(x != 0) ) {
            System.out.println(" x != 0 ");
        }
        System.out.println("끝!");

    }
}
