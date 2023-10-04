package com.green.revfile.ch6;

public class Ch6_CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod(){
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
