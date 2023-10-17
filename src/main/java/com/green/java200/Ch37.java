package com.green.java200;

public class Ch37 {
    public static final int PHYSICAL =23;
    public static final int EMOTIONAL =28;
    public static final int INTELLECUAL =33;
    public static  String textInfor(int index, double value){
        String result;
        switch (index){
            case PHYSICAL:
                result = "신체지수";
                break;
            case EMOTIONAL:
                result = "감정지수";
                break;
            case INTELLECUAL:
                result = "지성지수";
                break;
            default:
                result = "미결정";
                break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        int index = EMOTIONAL;
        double value = 0.99;
        String st = textInfor(index, value);
        System.out.println(st);
    }
}

