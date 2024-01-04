package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute; //false면 음소거 x
    private HarmanSpeaker speaker;
    SamsungTv(){
        speaker = new HarmanSpeaker();
    }

    public void sound(){
        if(!isMute){
            speaker.speak();
        }
    }
    public void toggleMute(){
        isMute = !isMute;
    }
}
