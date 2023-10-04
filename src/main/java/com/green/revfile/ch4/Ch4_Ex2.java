package com.green.revfile.ch4;

import java.util.Scanner;

public class Ch4_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 하나를 입력하세요.>");
        String tmp = scanner.nextLine();
        int imput = Integer.parseInt(tmp);

        if(imput != 0){
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        } else {
            System.out.printf("입력하신 숫자는 %d 입니다.", imput);
        }
    }
}
