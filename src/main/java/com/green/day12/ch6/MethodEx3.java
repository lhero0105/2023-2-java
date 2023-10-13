package com.green.day12.ch6;

public class MethodEx3 {

    int sumText(String str){
        int val = Integer.parseInt(str);
        int sum = 0;
        do {
            int modVal = val % 10;
            sum += modVal;
            val /= 10;
        }while (val > 0);
        return sum;
    }
    int sumText2 (String str){
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num += (str.charAt(i) - '0'); // num = num + ('1' - '0');
        }
        return num;
    }
    int sumText3 (String str){
        int sum = 0;
        char[] ch = new char[str.length()]; // char[] cjarArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            sum += Character.getNumericValue(ch[i]);
        }
        return sum;
    }
/*    int sumText4(String str){
        int val = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (val % 10);

        }
    }*/




    public static void main(String[] args) {
        MethodEx3 me3 = new MethodEx3();
        int sum = me3.sumText("123123");
        System.out.println("sum : " + sum); //12

        System.out.println("sum : " + me3.sumText("222")); //6
    }
}