package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        method1();
        try {
        method2(); //  throws로 던진애를 잡아줘야만 합니다. 에러발생 시 처리안하고 던집니다.

        } catch (Exception e){
            System.out.println("method2 예외 발생!!");
        }
        System.out.println("끝!!!");
    }
    static void method1(){
        int a = 10 /0;
    }
    static void method2() throws Exception{
        int a = 10 /0;
    }
}

class ExceptionEx12_2{
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println("예외 모음");
        }
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{ // 에러 발생 시 던집니다. >> 한곳으로 몰기위해 error를 던집니다.
        int a = 10/0;
    }
}