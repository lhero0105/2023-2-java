package com.green.day12.ch6;

public class Gugudan {
    void print(int n){
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
    void printFromTo(int min, int max){
        for (int i = min; i <= max; i++) {
            print(i);
        }
    }
    void printFromTo(int min, int max, String sep){
        for (int i = min; i <= max; i++) {
            print(i);
            System.out.println(sep);
        }
    }

/*
     static void print(int n){
         for (int i = 1; i < 10; i++) {
             System.out.printf("%d x %d = %d", n, i, n*i);
         }
     }
     static void printFromTo(int from, int to){
         for (int i = from; i < to; i++) {
             print(i);
         }
     }
     static void printFromTo(int from, int to, String spr){
         for (int i = from; i < to; i++) {
             print(i);
             System.out.println(spr);
         }
     }
*/


















}
