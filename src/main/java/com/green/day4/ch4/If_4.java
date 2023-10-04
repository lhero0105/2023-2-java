package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        // 50~200사이의 랜덤값
        // 100이하면 그 값의 *2한 결과값
        // 100 초과면 그 값의 +10한 결과값
        int random = (int)(Math.random()*151) +50;
        // int random = (int)(Math.random()*151 +50); 50이 더블로 형변환 됩니다. 주의

        System.out.printf("%d = %d", random,(random <= 100) ? random *= 2 : random + 10 );

    }
}
