package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

class starcraftGame{
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10,20);

        Unit unit2 = new Tank();
        unit2.move(10,20);
        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit2);


        // 객체를 담을 때 > 배열, ArrayList 이용합니다.
    }
}
class starcraftGame2{
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);//모든 캐릭터가 뜨도록
        Unit unit1 = units.get(units.size()-1);
        Tank tank = (Tank)unit1;
        tank.changeMode();
    }
    public static void moveAll(List<Unit> units, int x, int y){
/*        Unit unit1 = (Unit) units.get(0);
        Unit unit2 = (Unit) units.get(3);
        unit1.move(x,y);
        unit2.move(x,y);

        Marine unit3 = (Marine)units.get(0);
        Tank unit4 = (Tank)units.get(3);
        unit3.move(x,y);
        unit4.move(x,y);*/

        for (int i = 0; i < units.size(); i++) {
/*            Unit unit = units.get(i);
            unit.move(x,y);*/
            units.get(i).move(x,y);
        }
        for (Unit unit: units) {
            unit.move(x,y);
        }
    }
}
public abstract class Unit {
    protected int x;
    protected int y; // 개발자들은 따로따로 적습니다.
    public abstract void move(int x, int y);
    public void stop(){
        System.out.println("현재 위치에서 정지"); // 추상클래스가 추상매서드만 가질 수 있는것은 아닙니다.
    }
    public void setX(int x){ // setter 매소드엔 하나만 들어올 수 있습니다.
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }


}
class Marine extends Unit{
    @Override
    public void move(int a, int b) { // 매게변수명은 달라도 됩니다.
        this.x = a;
        this.y = b;
        setX(a);
        setX(b);
        System.out.printf("마린이 좌표 x:%d, y:%d로 이동\n", a, b);
    }
    public void steamPack(){
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit{
    private boolean siegeMode;
    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 x:%d, y:%d로 이동\n", x, y);
    }
    public void changeMode2(){// ture시즈모드가 되었습니다.
        if(siegeMode){
            siegeMode = false;
            System.out.println("시즈모드가 되었습니다.");
        }else{
            siegeMode = true;
            System.out.println("시즈모드가 풀렸습니다.");
        }
    }
    public void changeMode(){
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
    }
}