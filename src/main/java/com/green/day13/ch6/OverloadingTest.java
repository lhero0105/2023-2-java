package com.green.day13.ch6;
// 오버로딩 - 갯수와 타입위치
public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(10.20);
    }
    void print(){}
    void print(int n){}
    void print(int n1, double n2){}
    void print(double n1, int n2){}
    void print(int n1, String str2){}
    void print(String n1, int str2){}
}
