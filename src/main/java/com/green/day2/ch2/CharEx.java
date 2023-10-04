package com.green.day2.ch2;

public class CharEx {
    public static void main(String[] args) {
        char ch = '4'; // 인코딩
        int val = 66; // 디코딩

        System.out.printf("%c: %d\n" ,ch , (int)ch);
        System.out.printf("%c: %d\n", (char)val,val);
    }
}
