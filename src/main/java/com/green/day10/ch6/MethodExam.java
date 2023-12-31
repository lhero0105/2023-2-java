package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n1) {
        System.out.println("n1 : " + n1);
        // System.out.printf( n1 == 0 ? "%d이 맞습니다" : "0이 아닙니다\n", n1 );
        // 아래쪽 권장
        if (n1 == 0) {
            System.out.println("0입니다");
            return;
        }
        System.out.println("0이 아닙니다");
    }

    int randomValFromTo(int from, int to) {
        int result = (int) (Math.random() * (to - from + 1) + from);
        return result;
    }

    void scoreResultPrint(int n1) {
        char grade = 'D';
        if (n1 > 100) {
            System.out.println("잘못된 점수입니다.");
            return;
        } else if (n1 >= 90) {
            grade = 'A';
        } else if (n1 >= 80) {
            grade = 'B';
        } else if (n1 >= 70) {
            grade = 'C';
        } else if (n1 >= 0) {
            grade = 'D';
        }
        System.out.printf("%c학점", grade);
    }
}