package com.green.day12.ch6;

class Data2 {
    int x;
    double d;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        d.d = 100.5;

        Data2 d2 = copyObj(d); // d
        System.out.println("d == d2 : " + (d == d2)); // false // 주솟값이 다르다
        System.out.println("d.x == d2.x : " + (d.x == d2.x)); // true
        System.out.printf("d.d == d2.d : " + (d.d == d2.d)); // true
    }
    static Data2 copyObj(Data2 a){
        Data2 d = new Data2();
        d.x = a.x;
        d.d = a.d;
        return d;
    }
}
