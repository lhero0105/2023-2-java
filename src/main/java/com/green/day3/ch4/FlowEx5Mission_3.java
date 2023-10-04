package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요(남자, 여자) >>");
        String gender = scan.nextLine();
        System.out.print("키를 입력해 주세요 >>");
        int height = scan.nextInt();
        String ave = "평균";
        if ("남자".equals(gender)) { // 남자 170
            if (height > 170) {
                ave += " 초과";
            } else if (height < 170) {
                ave += " 미만";
            }
        } else { // 여자 157
            if (height > 157) {
                ave += " 초과";
            } else if (height < 157) {
                ave += " 미만";
            }
        }
        System.out.printf("%dcm는 %s %s 입니다.", height, gender, ave);
    }
}
