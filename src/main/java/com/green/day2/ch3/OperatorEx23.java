package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Hello"; //  "" 와 new 객체로 만든 변수는 각각 다른 메모리 영역에 저장하기에 == 으로 주소값이 같냐? 물었을 때 다르다고 나옵니다.
        String s3 = new String("Hello");
        // String s3 = "hello";
        // 대소문자 구별하지 않고 비교하려면 equalsIgnoreCase()를 사용

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); // true
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3); // 주소값이 같냐? false
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1));
        // 자바에서 문자열 매소드는 equals 매소드를 꼭 이용해야 한다. 중요합니다!
        // reference type 에서 == 비교는 주소값 비교 (동일성 - 같은 객체이냐), (동등성 - 같은 값이냐)
    }
}
