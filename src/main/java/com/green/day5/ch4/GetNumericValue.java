package com.green.day5.ch4;

public class GetNumericValue {
    int sumText(String str) {
        int sum = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            sum += Character.getNumericValue(ch[i]);
        }
        return 2; //error 없앰
    }
}
