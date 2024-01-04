package com.green.day29.ioc;

public class TvTest {
    public static void main(String[] args) {
        String strTv = args[0];
        String  strSpeaker = args[1];
        String strWoofer = args[2];
        // 윗 부분도 외부에 파일을 만들어서 사용하기에 변경하는게 없어집니다.
        Tv tv = TvFactory.instance(strTv, strSpeaker, strWoofer);
        tv.sound();
        tv.toggleMute();
        tv.sound();
    }
}