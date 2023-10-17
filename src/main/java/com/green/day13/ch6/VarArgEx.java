package com.green.day13.ch6;
// 가능하면 가변인자를 사용한 매서드를 오버로딩하지 않는 것이 좋다 (p.290)
public class VarArgEx {
    public static void sum(int...n){ // 가변인자는 배열로 저장합니다.

        System.out.println(n.length);
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(10, 20); // sum = 30
        sum(10, 20, 30); // sum = 60
        sum(10, 20, 30, 40); // sum = 100
    }
}
