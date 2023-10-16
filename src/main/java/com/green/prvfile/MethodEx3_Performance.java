package com.green.prvfile;

public class MethodEx3_Performance {
    static int sumText1(String num){
        int numI = Integer.parseInt(num);
        int sum = 0;
        while (numI != 0){
            int n = numI % 10;
            sum += n;
            numI /= 10;
        }
        return sum;
    }
    static int sumText2(String str){
        int sum = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
            sum += Character.getNumericValue(ch[i]);
        }

        return sum;
    }
    static int sumText(String str){
        //char[] ch = new char[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodEx3_Performance me3 = new MethodEx3_Performance();
        int sum = me3.sumText("123123");
        System.out.println("sum : " + sum); //12

        System.out.println("sum : " + me3.sumText("222")); //6


        String test = "9871231";
        System.out.println(me3.sumText(test));
        System.out.println(me3.sumText2(test));
        sum = 0;
        long beforeTime1 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            sum = me3.sumText(test);
        }
        long afterTime1 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime1 = (afterTime1 - beforeTime1); //두 시간에 차 계산
        System.out.println("1-시간차이(m) : " + secDiffTime1);

        long beforeTime2 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            int sum2 = me3.sumText2(test);
        }
        long afterTime2 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime2 = (afterTime2 - beforeTime2); //두 시간에 차 계산
        System.out.println("2-시간차이(m) : " + secDiffTime2);
    }
}