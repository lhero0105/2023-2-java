package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        // 초기화 ; 조건식 ; 증감식
        // 실행순서 - 초기화 > 조건식 > 블록 > 증감식 >> 조건식이 false가 될때까지
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("안녕");
        }
        System.out.println("---끝---");

        int j = 0;
        for (;j<10;){
            System.out.println("j : " + (++j));
        }
    }
}
