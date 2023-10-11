package com.green.day9.ch9;

public class ArrayEx_19 {
    public static void main(String[] args) {
        int[][] score = {
                // 국  영  수
                {101, 102, 103}, // 0 > 1
                {  21, 22, 23}, // 1 > 2
                {  31, 32, 33}, // 2 > 3
                {  41, 42, 43}, // 3 > 4
                {  51, 52, 53} // 4 > 5
        };
        /*
        번호  국어  영어  수학  총점  평균
        -------------------------------
        1   102   103   104   306   102.0
        ...
        5   51    53    53    ??    ??
        --------------------------------
        총점 ??    ??    ??
         */


        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("------------------------------");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            double average = 0;
            System.out.printf("%d", i);
            for (int c = 0; c < score[i].length; c++) {
                sum += score[i][c];
                average = (double)sum / 3;
                System.out.printf("%6d", score[i][c]);
            }
            System.out.printf("%6d", sum);
            System.out.printf("%6.01f", average);
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.print("총점");
        for (int i = 0; i < score[i].length; i++) {
            int sum = 0;
            for (int j = 0; j < score.length; j++) {
                sum += score[j][i];
            }
            System.out.printf("%5d", sum);
        }
/*        System.out.println("------------------------------");
        System.out.print("총점");
        for (int[] row: score) {
            int sum = 0;
            for (int col : row) {
                sum += col;
            }
            System.out.printf("%5d", sum);
        }*/
    }
}