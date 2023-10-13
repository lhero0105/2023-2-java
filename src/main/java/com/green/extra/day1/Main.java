package com.green.extra.day1;

import java.util.Arrays;

// public - 파일 네임과 클레스 명이 동일 하여야 붙일 수 있습니다.
public class Main {
    //                네임 (매게변수)
    public static void main(String[] args) {
        System.out.println(args.length);
        // System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("-------------");
        for (String a: args ) { // 방 하나하나씩 들어갈 때 type지정을 위해 적습니다.
            System.out.println(a);
        }
    }
}
class Util1{

}
class Util2{

}