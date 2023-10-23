package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

/*
중복되지 않은 숫자 0~9 사이 숫자 3개를 맞추는 숫자입니다.
ex) 3 7 2
    1 2 3
    s : 0, b : 2, o : 1
s - 숫자 + 자리
b - 숫자
o - 둘다 x
 */
public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
    }
}

class NumberBaseball{
    private final int GAME_COUNT;
    private final int[] gameNumbers; // ** 레퍼런스의 final은 주솟값을 못바꿉니다. 값은 변경 가능합니다.
    public NumberBaseball(int count){
        GAME_COUNT = count; // 상수는 무조건 기입해야합니다만, 생성자를 통해서도 가능합니다.
        gameNumbers = new int[count];
    }
    public void start(){
        setRandomNumNotDuplicate(); // 0~9 사이의 랜덤값 중복없이
        getUserInput();
    }

    private void getUserInput(){
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ", i+1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);

        scan.close();// 스케너를 다 쓰고 반납해야합니다.
    }
    public boolean isContinueCheckResult(int[] arr){
        int strike = 0, ball = 0, out;
        for (int i = 0; i < gameNumbers.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == gameNumbers[i]){
                    if(i == j){
                        strike++;
                    }else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        return false;
    }
    public void setRandomNumNotDuplicate(){
        for (int i = 0; i < GAME_COUNT; i++) {
            gameNumbers[i] = getRandomValue();
            for (int j = 0; j < i; j++) {
                if(gameNumbers[i] == gameNumbers[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
    }
    private int getRandomValue(){
        return (int)(Math.random()*10);
    }
}
