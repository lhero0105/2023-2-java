package com.green.day12.ch6;

public class Card {
    String kind;
    String number;
    public int getScore(){
        // int a = Integer.parseInt(n);
        switch (number){
            case "A": return 1;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
        }
        int n1 = Integer.parseInt(number);
        return n1;
    }
}
