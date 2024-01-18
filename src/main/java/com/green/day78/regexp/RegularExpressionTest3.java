package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest3 {
    public static void main(String[] args) {
        String str1 = "회5646";
        String str2 = "회1 2";
        String str3 = "회14586";
        String str4 = "14586";
        String str5 = "ㅏㅡ   ㅢㅇㅈ11하하하하하1212";
        String regexp = "^([ ㅏ-ㅣㄱ-ㅎ가-힣0-9]+[0-9]*)$"; // 영문 소대문자
        // + 무조건 한자 있어야함, | 없어도 됨, 빈칸 포함
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));

    }
}
