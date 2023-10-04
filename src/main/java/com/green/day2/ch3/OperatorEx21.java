package com.green.day2.ch3;

public class OperatorEx21 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10, n3 = 11, n4 = 9;
        System.out.printf("%d < %d : %b\n", n1, n2, n1 < n2); // false
        System.out.printf("%d < %d : %b\n", n1, n3, n1 < n3); // true
        System.out.printf("%d < %d : %b\n", n1, n4, n1 < n4); // false
        System.out.printf("%d <= %d : %b\n", n1, n2, n1 <= n2); // true
        System.out.printf("%d <= %d : %b\n", n1, n3, n1 <= n3); // true
        System.out.println("-----------------------------------");
        System.out.printf("%d > %d : %b\n", n1, n2, n1 > n2); // false
        System.out.printf("%d > %d : %b\n", n1, n4, n1 > n4); // true
        System.out.printf("%d >= %d : %b\n", n1, n2, n1 >= n2); // true
        System.out.printf("%d >= %d : %b\n", n1, n4, n1 >= n4); // true
        System.out.println("------------------------------------");
        System.out.printf("$d == $d : $b\n", n1, n2, n1 == n2); // true
        System.out.printf("$d == $d : $b\n", n1, n3, n1 == n3); // false
        System.out.printf("$d != $d : $b\n", n1, n2, n1 != n2); // false
        System.out.printf("$d != $d : $b\n", n1, n3, n1 != n3); // true

    }
}
