package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "abc@naver.com";
        String str2 = "ab_c@naver.co.kr";
        String str3 = "회14586";
        String str4 = "14586";
        String str5 = "ㅏㅡ   ㅢㅇㅈ11하하하하하1212";
        String regexp = "^[a-zA-Z0-9]+@[a-zA-Z0-9]{3,}\\.[a-z.]+$"; // 영문 소대문자
        String regexp2 = "^[a-zA-Z0-9-_]+@([a-zA-Z0-9]{3,}\\.[a-z.]{2,}|[a-zA-Z0-9]{2,}\\.[a-z]{2,})$";
        // + 무조건 한자 있어야함, | 없어도 됨, 빈칸 포함
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp2, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp2, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));

    }
}
