package com.green.day4.ch4;
// 실행결과
// 10는(은) 절대값 10
// -9는(은) 절대값 9
public class Abs {
    public static void main (String[] agrs){
        int num = -6;

        // Case1
        if( num < 0) {
            System.out.printf("%d는(은) 절대값 %d", num, -num);
        } else {
            System.out.printf("%d는(은) 절대값 %d", num, num);
        }

        // Case2
        System.out.printf("%d는(은) 절대값 %d", num, (num < 0) ?  (num *= -1) : num );

        // Case3
        int res = (num < 0) ?  (num *= -1) : num;
        System.out.printf("%d는(은) 절대값 %d", num, res);
    }
}
