package com.green.prvfile;

import java.util.ArrayList;
import java.util.List;

class starcraftGame{
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10,20);

        Unit unit2 = new Tank();
        unit2.move(10,20);
        List<Unit> list = new ArrayList<>();
        list.add(unit);
        list.add(unit2);
    }
}
class starcraftGame2{
    public static void main(String[] args) {
        List<Unit> list = new ArrayList<>();
        list.add(new Marine());
        list.add(new Marine());
        list.add(new Tank());
        list.add(new Tank());
        list.add(new Tank());

        moveAll(list,30,50);
        Unit unit = list.get(list.size()-1);

        Tank tank = (Tank) unit;
        tank.changeMode();
        tank.changeMode();

    }
    public static void moveAll(List<Unit> list, int x, int y){
        for ( Unit unit : list ) {
            unit.move(x,y);
        }
    }
}
public abstract class Unit {
    protected int x;
    protected int y;
    public abstract void move(int x, int y);
    public void stop(){
        System.out.println("현재 위치에서 정지");
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}
class Marine extends Unit{
    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.printf("마린이 좌표 x:%d, y:%d로 이동\n", x, y);
    }
    public void steamPack(){
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit{
    private boolean siegeMode;
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 x:%d, y:%d로 이동\n", x, y);
    }
    public void changeMode(){
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");}
    }
