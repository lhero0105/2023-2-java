package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        //반복문을 사용하여 1~10을 전부 더한 값을 출력해주세요
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        } // scope - {}단위마다 생명주기가 다릅니다.
        System.out.println(sum);
    }
}