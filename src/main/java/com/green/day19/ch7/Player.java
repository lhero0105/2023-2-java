package com.green.day19.ch7;
// 클래스는 자기가 가진 자식 중 단 하나라도 추상매소드가 있다면 나 자신도 추상 클래스가 되어야 합니다.
// 구현부가 없는 선언부만 있는 클래스입니다.
// 추상클래스는 객체화가 안됩니다.
// 자손마다 다르게 구현 될 것으로 구현 될 것으로 예상되는 경우 (나를 상속받은 애들이 모두가 다 다를 때, 반대로 몇몇 개만 할 땐 매소드로 합니다)
// 강제성이 있습니다. >> 오버라이딩으로 무조건 구현해주어야 합니다.
abstract public class Player { // 객체화 안되게 막기 위해 abstract를 붙힙니다
    public abstract void play(int pos);

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
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
class  VideoPlayer extends Player{
    @Override
    public void play(int pos){
        System.out.println("Video Plat 위치 : " + pos);
    }
}
abstract class DvdPlayer extends Player{

}