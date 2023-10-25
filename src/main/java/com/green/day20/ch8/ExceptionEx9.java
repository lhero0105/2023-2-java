package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("일부러 에러 터트림!!");
            System.out.println("dddd");
            throw e; // 일부러 예외를 터트립니다. catch로 던집니다.
            // throw new Exception("일부러 크크크");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("--끝--");
    }
}
