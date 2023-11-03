package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        String r1 = str.substring(2, 4);// 4-2면 두글자니까 쉽게 볼 수 있도록하기위해 만들어졌습니다.
        System.out.println("r1 : " + r1);

        System.out.println("r2 " + str.substring(4)); // 하나보내면 해당 인덱스부터 끝까지 보여줍니다.
    }
}
