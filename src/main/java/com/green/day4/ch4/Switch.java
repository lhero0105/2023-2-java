package com.green.day4.ch4;
// java에서는 if 삼항 switch 3가지입니다.
public class Switch {
    public static void main(String[] args) {
        int val = 5;
        switch (val){
            default:
                System.out.println("1~3이 아니다");
                break;
            case 1 :
                System.out.println("1이다");
                break; // 브레이크를 만나면 switch문을 빠져 나갑니다.
            case 2 :
                System.out.println("2이다");
                break;
            case 3 :
                System.out.println("3이다");
                break;

            // default가 항상 아래 와야하는것은 아닙니다. default가 마지막에 실행되기에..
        }
        System.out.println("끝");
    }
}
