package com.green.java200;

public class Ch28 {
    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;
        double phyval = 100*Math.sin((days % index) * 2 * Math.PI/index);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
    }
}
