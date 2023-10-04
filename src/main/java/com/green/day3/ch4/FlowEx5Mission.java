package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        // 남자의 평균키 170, 여자의 평균키 157
        // 스캐너를 이용하여 성별을 입력받습니다. (남, 여)
        // 키를 입력 받습니다.
        // 평균키 이하면 "156cm는 남자 평균 미만입니다."
        // 평균키랑 같다면 "170cm는 남자 평균입니다."
        // 평균키 초과면 "178cm는 남자 평균 초과입니다."

        // 평균키 이하면 "146cm는 여자 평균 미만입니다."
        // 평균키랑 같다면 "157cm는 여자 평균입니다."
        // 평균키 초과면 "170cm는 여자 평균 초과입니다."

        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해주세요 > ");
        String inputGen = scanner.nextLine();
        System.out.println("키를 입력해주세요 > ");
        int inputNum = scanner.nextInt();

        if( inputGen.equals("남자")){
            if( inputNum > 178 ){
                System.out.printf("%d는 %s 평균 초과입니다", inputNum, inputGen);
            } else if ( inputNum == 170) {
                System.out.printf("%d는 %s 평균입니다", inputNum, inputGen);
            } else if ( inputNum < 156 ){
                System.out.printf("%d는 %s 평균 미만입니다", inputNum, inputGen);
            }
        } else if ( inputGen.equals("여자") ){
            if( inputNum > 170 ){
                System.out.printf("%d는 %s 평균 초과입니다", inputNum, inputGen);
            } else if ( inputNum == 157) {
                System.out.printf("%d는 %s 평균입니다", inputNum, inputGen);
            } else if ( inputNum < 146 ){
                System.out.printf("%d는 %s 평균 미만입니다", inputNum, inputGen);
            }
        }


    }
}
