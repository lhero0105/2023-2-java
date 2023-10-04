package com.green.day2.ch2;

import java.util.Date;
// java.util. 의 Date 클래스를 사용 할 겁니다.

public class Naming {
    public static void main(String[] args){
        // 네이밍
        // 1. 대소문자 구별. 길이제한 x
        int abc, aBc, abC, qwewqdadcwewctwetcwet;

        // 2. 예약어 사용 X
        // int, void, static

        // 3. 숫자 시작 X
        // int 1ab;

        // 4. 특수 문자는 _와 $만 가능
        int _ab, $ab;

        // --------------------------------------

        /* 케이스 기법
        hello my name is hong

        1. 파스칼 기법
        HelloMyNameIsHong
        2. 카멜 케이스 기법 (변수명, 메소드명)
        hellMyNameIsHong
         - 첫 글자 소문자
        3. 케밥 케이스 기법
        hello-my-name-is-hong( java에선 못씀 // css 등에서)
        4. 스네이크 케이스 기법
        hello_my_name_is_hong
        */
        // --------------------------------------------
        /* 상수는 전부 대문자 구분은 언더바
        *
        * PI, MAX_NUMBER
        */
        // 원시형 8개, 참조형
        final int PI = 0, MAX_NUMBER = 10;
        Date today = new Date();
        // java.util.Date today = new java.util.Date();
        // 참조(reference type)형 변수
    }
}
