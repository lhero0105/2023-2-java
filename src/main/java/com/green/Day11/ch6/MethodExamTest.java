package com.green.Day11.ch6;


public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(100



        );
        System.out.printf("r1: %s\n", r1);
        /*
        100초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        A학점 8점이상 +, 3점이하 -, 나머지 0
        B학점 8점이상 +, 3점이하 -, 나머지 0
        C학점 8점이상 +, 3점이하 -, 나머지 0
        D학점 (+-0 없음)
         */

        String season = me2.getSeason(10);
        /*
        234 >> 봄
        567 >> 여름
        8910 >> 가을
        11121 >> 겨울
        나머지 >> 없음
         */
        System.out.print(season);
    }
}