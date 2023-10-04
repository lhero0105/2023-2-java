package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        // charAt() - 문자배열 중 index번호를 가져옵니다 , "문자배열"이기 때문에 0부터 시작합니다.
        String str = "abcdefghijk"; // .으로 매서드를 호출합니다.
        String str2 = str.toUpperCase(); // 비파괴 - 원본이 회손되지 않습니다.
        str2.charAt(1);
        System.out.println(str2);

        char result = str2.charAt(1);// 해당 index를 가져와서 result에 저장합니다.
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str2.charAt(2));
    }
}
