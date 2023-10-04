package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        int val = (int)(Math.random()*100) +1; // 1~100
        // System.out.println(val);

        //val값이 11면 > "11는(은) 홀수입니다."
        //val값이 12홀수면 > "11은 짝수입니다."

        // Case 1
        if( val % 2 == 0){
            System.out.printf("%d는(은) 짝수입니다.", val);
        }else {
            System.out.printf("%d는(은) 홀수입니다.", val);
        }
        // Case 2
        String a ="짝";
        String b ="홀";
        System.out.printf("%d는(은) %s수입니다.", val, (val % 2 == 0) ? a : b );
    }
}
