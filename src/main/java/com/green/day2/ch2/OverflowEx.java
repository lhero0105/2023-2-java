package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args){
        int intval = 5;
        byte byteVal = (byte) intval;
        System.out.printf("byteVal : %d\n", byteVal);

        int intval2 = 128;
        byte byteVal2 = (byte) intval2; // 오버플로우 Overflow
        System.out.printf("byteVal : %d\n", byteVal2);

        int intval3 = -129;
        byte byteVal3 = (byte) intval3; // 언더플로우 Underflow
        System.out.printf("byteVal : %d\n", byteVal3);
    }
}
