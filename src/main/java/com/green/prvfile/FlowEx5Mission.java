package com.green.prvfile;

import java.util.Scanner;

//성별을 입력해 주세요(남자, 여자) >>"
//키를 입력해 주세요 >>
//ex) 171cm는 남자 평균 초과 입니다.
// 170 157
public class FlowEx5Mission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요(남자, 여자) >>");
        String gen = scanner.nextLine();
        System.out.println("키를 입력해 주세요 >>");
        int key = scanner.nextInt();
        String ave = "평균";

        if ( "남자".equals(gen) ) {
            if( key > 170 ){
                ave += "초과";
            } else if ( key < 170 ){
                ave += "미만";
            }
        } else {
            if( key > 157 ){
                ave += "초과";
            } else if ( key < 157 ) {
                ave += "미만";
            }
        }
        System.out.printf("%dcm는 %s %s 입니다.", key, gen, ave);
    }
}
