package com.green.day12.ch6;
class Data{
    int x;
}
public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x);
        change(d.x);
        System.out.printf("change() : x = %d\n", d.x);

        System.out.println("------------------------");
        Data d2 = new Data();
        d2.x = 100;
        System.out.printf("change() : x = %d\n", d2.x);
        change(d2);
        System.out.printf("change() : x = %d\n", d2.x);
    }

    public static void change(int x){
        x = 1000;
        System.out.printf("change() : x = %d\n", x);
    }

    public static void change(Data d){
        //Data d = new Data();
        d.x = 1000;
        System.out.printf("change() : x = %d\n", d.x);
    }
}
