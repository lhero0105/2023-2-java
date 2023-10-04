package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        // 중첩 for문을 활용하여 구구단 2~9단출력

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j );
            }
            System.out.println();
        }
    }
}
