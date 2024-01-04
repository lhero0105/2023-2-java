package com.green.day29.normal2;

import com.green.day29.Speaker;

public abstract class Tv {
    boolean isMute; //false면 음소거 x
    Speaker speaker;
    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }
    public void toggleMute(){
        isMute = !isMute;
    }
}
