package com.green.Day11.ch6;

public class StopPrint {
    void line(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    /*void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    void square(int n){
        for (int i = 0; i < n; i++) {
            this.line(n); // this 생략가능
        }
    }

    // Case 1
    void triangle(int n){
        for (int i = n; i >= 0; i--) {
            line(n-i);
        }
    }
    // Case 2
    void triangle2(int n){
        for (int i = 0; i <= n; i++) {
            line(i);
        }
    }
    void triangle3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    String chkGenderById(String str){ // String은 문자배열입니다.
        String male = "";
        if(str.charAt(7) == '2' || str.charAt(7) == '4'){
            male = "여성";
        } else if (str.charAt(7) == '1' || str.charAt(7) == '3') {
            male = "남성";
        }else {
            return "유효하지 않은 주민번호";
        }
        return male;
    }
    // charAt(인수) - 인수번째의 문자를 읽어냅니다.
    // indexOf(인수) - 인수가 들어있는 위치를 읽어줍니다.
    // subString(인수, 인수) - 인수범위의 문자열을 읽어 냅니다.

    int sumFromTo(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}