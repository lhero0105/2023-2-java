package com.green.Day11.ch6;

public class StopPrintTest {
    public static void main(String[] args) {
        StopPrint sp = new StopPrint();

        sp.line(5); // *****(개행)
        sp.line(7); // *******(개행)

        sp.square(6);

        sp.triangle(5);

        sp.triangle3(5);
        // ssss*
        // sss**
        // ss***
        // s****
        // *****

        String gender = sp.chkGenderById("000000-127111");
        System.out.println(gender);
        /*
        8번째 자리의 숫자가
        2,4이면 > 여성
        1,3이면 > 남성
        이외의 값이면 > 유효하지 않은 주민번호
         */

        int sum = sp.sumFromTo(4, 10);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println(sum);
        System.out.println(sum2);
    }
}