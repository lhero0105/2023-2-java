package com.green.java200;

public class Ch36 {
    public static void main(String[] args) {
        int temp = 298;
        int s;
        if(temp % 2 == 0){
            s = temp / 2;
        }else{
            s = temp *3 +1;
        }
        System.out.println(s);
    }
}
