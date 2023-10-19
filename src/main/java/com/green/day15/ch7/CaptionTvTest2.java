package com.green.day15.ch7;
// 클래스간의 관계는 포함관계(90%), 상속관계가 있습니다.
// 상속관계 사용 이유 - 코드를 줄일 수 있습니다.
// CardDeck은 Card를 갖고 있다(has a) - 포함관계
// 오버라이딩 - 부모의 매서드를 자식이 동일한 선언부로 재정의하여 사용하는 것을 말합니다.

class Tv2{
    boolean power;
    int channel;
    void power(){ power = !power; } // toggle 기능
    void channelUp(){ channel++; }
    void channelDown(){ channel--; }
}
class CaptionTv2 extends Tv2{
    int channel;
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    @Override
    void channelUp(){
        channel += 2;
    }
    void  printParentChannel(){ // (int channel)지역변수
        System.out.printf("parent-channel : %d\n", super.channel); // this. super. 지역변수 일 떄 생각
    }
}
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 cTv = new CaptionTv2();
        cTv.channel =10;
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n", cTv.channel);
        // 부모와 자식 둘다  channel 이 있을 때, 먼저 자식의 channel에 저장됩니다.
        // channelUp 하면 자식에 channelUp()이 없기에 부모의 channel을 ++시킵니다.(0 > 1)
        // 그 상태에서 다시 자식의 channel에 접근하여 출력 했으니 그대로 10이 찍힙니다.
        cTv.printParentChannel();
    }
}
