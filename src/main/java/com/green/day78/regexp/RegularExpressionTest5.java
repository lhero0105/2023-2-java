package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest5 {
    public static void main(String[] args) {
        String str1 = "010-123";
        String str2 = "011-123-1512";
        String str3 = "012";
        String str4 = "013";
        String str5 = "015-12345";
        String str6 = "017-1244-44";
        String str7 = "018-1";
        String str8 = "019-0000-1554";
        String regexp = "^01[0-1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$";

        // + 무조건 한자 있어야함, | 없어도 됨, 빈칸 포함
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp, str6));
        System.out.printf("%s > %b\n", str7, Pattern.matches(regexp, str7));
        System.out.printf("%s > %b\n", str8, Pattern.matches(regexp, str8));

    }
}
