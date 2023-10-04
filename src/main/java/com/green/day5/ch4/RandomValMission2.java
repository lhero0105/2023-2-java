package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 10, MAX = 50; //MAX
        //10~50
        // 리터럴은 더 이상 하지 않는다.
        //min, max 변수만 사용하여
        // MIN ~ MAX 나올 수 있는 랜덤 숫자를 만드는 로직을 구현 하시오
        for (int i = 0; i < 1000; i++) {
            int val = (int)(Math.random()*(MAX - MIN + 1))+MIN; // 코드 재사용성을 위해.. 로직 중요
            int val2 = (int)(Math.random()*( MAX-MIN + MAX/MAX))+MIN;
            System.out.println("val : " + val);
            if(val < MIN || val > MAX){
                System.out.println("범위를 벗어났습니다.");
                break;
            }
        }
        System.out.println("끝!!");
    }
}