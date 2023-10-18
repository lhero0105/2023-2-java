package com.green.day15.ch7;
class Tv{
    boolean power;
    int channel;
    void power(){ power = !power; } // toggle 기능
    void channelUp(){ channel++; }
    void channelDown(){ channel--; }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b", cTv.power); // false
        cTv.power();
        System.out.printf("cTv.power : %b", cTv.power); // true
        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv. channel : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구들!!!");
        cTv.caption = true;
        cTv.displayCaption("wkaf[wkfp[wef!");
    }
}
