package com.green.day12.ch6;

public class Card {
    public String kind; // 속성 - 값 저장 담당
    public String number;


    public int getScore(){ // 매소드 - 동적인 애들 담당
        switch (number){
            case "A": return 1;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
        }
        int num = Integer.parseInt(number);
        return num;
    }
    public void printYourSelf(){
        System.out.printf("%s (%s)\n", kind, number);
    }
}