package com.green.extra.day1.day2;

import java.util.Arrays;

public class Utils {
    public static int abs(final int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }

    public static int sumArr(int[] intArr){
        int sum = 0;
/*        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }*/
        for ( int arr : intArr ) {
            sum += arr;
        }
        return sum;
    }

    public static int[] mapPlus(int[] intArr, int n){
        int[] rArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            rArr[i] = intArr[i] + n;
        }
        return rArr;
    }
}

class UtilsTest{
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r : " + r);
        System.out.println("r : " + Utils.abs(-9));
        System.out.println("r : " + Utils.abs(8));

        int[] intArr = { 10, 12, 13, 14 };
        int sum = Utils.sumArr(intArr);
        System.out.println(sum);//

        int[] rArr = Utils.mapPlus(intArr, 5);
        System.out.println(Arrays.toString(rArr)); // [ 15, 17, 18, 19]
    }
}
