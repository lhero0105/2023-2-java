package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class LgTv extends Tv {
   public LgTv(Speaker speaker){
       System.out.println("-- LgTv 생성 --");
       this.speaker = speaker;
   }
}
