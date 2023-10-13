package com.green.extra.day1;

public class StringEx {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("hello");
        //s1 과 s2같은값? > true
        //s2 과 s3같은값? > false
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
    }
}