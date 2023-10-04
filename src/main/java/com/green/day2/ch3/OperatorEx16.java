package com.green.day2.ch3;
// 피연산자의 타입이 int보다 작은 타입이면 int로 변환
// ex) byte + short -> int + int -> int
public class OperatorEx16 {
    public static void main (String[] args){
        float pi = (float) 3.141592;
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 " + pro1);

        float pro2 = pro1 * 0.001f;
        System.out.println("pro2 : " + pro2);

        System.out.println("one : " + (int)(pi * 0.001f));
    }
}
