package com.green.day29.normal;

public class AppleSpeaker {
    private HansungWoofer woofer;
    private HanilWoofer woofer2;
    public AppleSpeaker(){
        woofer = new HansungWoofer();
        woofer2 = new HanilWoofer();
    }

    public void sound() {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer2.soundBase();
    }
}
