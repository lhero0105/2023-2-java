package com.green.day6.ch4;
// do while문 대제 > 불린값으로 무한루프주어 조건문에 break써서 탈출
import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        while (true){
            System.out.println("1~100사이의 숫자 입력 (종료:0) >> ");
            input = scanner.nextInt();
            if(input == 0){
                break;
            }
            sum += input;
        }
        System.out.println("끝!!" + sum);
    }
}
