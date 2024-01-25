package com.green.day83;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setItem(1);
        int intVal = (int)b1.getItem();
        System.out.println("intVal : " + intVal);
        b1.setItem("아아아");
        int strVal = (int)b1.getItem(); // RuntimeError
        String str = (String) b1.getItem();
        // 빼낼 때 형변환을 해야하는 불편함이 있습니다.

        Box b2 = new Box();
        b1.setItem("안녕");
        // 모든 타입이 들어가는데 문제는 빼낼 때
    }
}
