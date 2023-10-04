package com.green.revfile.ch5;
// 버블정렬 알고리즘을 통한 크기 순으로 배열 정렬
public class Ch5_Ex10_S {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10 ));
        }
        System.out.println();
        for (int i = 0; i < numArr.length - 1; i++) { // -1 > 마지막에 정렬완료되기에
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 -i; j++) {

                if(numArr[j] > numArr[j + 1]){
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j+1] = temp;

                    changed = true;
                }
            }

            if(!changed){ // changed 가 false라면 > if문이 실행 된 적이 없다
                break; // break를 감싸는 가장 가까운 반복문 탈출
            }

            for (int f = 0; f < numArr.length; f++) {
                System.out.print(numArr[f]);
            }
            System.out.println();
        }
    }
}
