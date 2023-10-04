package com.green.day2.ch2;

public class Mission1Result {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;

        System.out.println(n1 / n2);

        double r = (double) n1 / n2;
        float r2 = (float)n1 / n2;
        // 10.0 / 3 중 에서 10.0이 이겨서 3 > 3.0 으로 바뀝니다.
        // byte > sort, char > int > long > float > double >> string
        System.out.println("r : " + r);
        System.out.println("r2 : " + r2);
    }
}
