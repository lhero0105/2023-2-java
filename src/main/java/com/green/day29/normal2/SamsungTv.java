package com.green.day29.normal2;

import com.green.day29.Speaker;

public class SamsungTv extends Tv{
    public SamsungTv(){
        speaker = new AppleSpeaker();
    }
}