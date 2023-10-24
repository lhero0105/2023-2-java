package com.green.prvfile;



abstract public class Player {
    public abstract void play(int pos);

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        AudioPlayer vp = new AudioPlayer();
        vp.play(20);
        Player player = (Player) ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}
class AudioPlayer extends Player{
    @Override
    public void play(int pos){
        System.out.println("Audio Play 위치 : " + pos);
    }
}
class VideoPlayer extends Player{

    @Override
    public void play(int pos) {
        System.out.println("Video Plat 위치 : " + pos);
    }
}