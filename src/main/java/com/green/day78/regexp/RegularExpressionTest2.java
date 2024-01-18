package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        String str1 = "adwpjDFfepe";
        String str2 = "ADWSDWFa   ffe";
        String str3 = "12A345";
        String regexp = "^[a-z|A-Z]*$"; // 영문 소대문자
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));

    }
}
