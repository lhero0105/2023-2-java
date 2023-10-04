package com.green.day3.ch4;

public class AssignmentOperator {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int n1 , n2, n3;
        n3 = 10;
        n1 = n2 = n3; // 오른쪽부터 복사하여 값을 줍니다.
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n", n1, n2, n3);
        n1 = n1 + 4; // 대입연산자는 오른쪽에서 왼쪽으로 읽습니다. > n1 + 4 더하여 n1에 저장합니다.

        n2 += 4; // 읽기 > 연산 > 저장
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n", n1, n2, n3);

        n3++; // 전위형 <> 후위형
        // 전위형 (++n) - 쓰기부터 하고 읽기를 합니다.
        // 후위형 (--n) - 읽기부터 하고 쓰기를 합니다.
        // = 을 제외하고 값이 바뀌는 것은 증감연산자 뿐 입니다.
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n", n1, n2, n3);
    }
}
