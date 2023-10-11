package com.green.day10.ch6;

public class ReturnNumberBox {
    int sum(int n1, int n2){
        return n1 + n2;
    }
    int abs(int n1){
        if(n1<0){ n1 *= -1;}
        return n1;
    }
    int abs2(int n1){
        int result = 0; // 복사본을 수정했기에 원본훼손x
        if(n1<0){
            result = n1;
        }
        return result;
    }

    int abs3(int n){
        if(n < 0){
            return -n; // 원본이 수정되지 않습니다 수정 시에는 대입연산자가 들어가야만 합니다.
        }
        return n;




    }
}
