package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" },
        };
        /*
        Q1. chair의 뜻은? >> 정수
        틀렸습니다. 정답은 의자입니다.

        Q2. computer 뜻은? >> 컴퓨터
        정답입니다.. 정답은 컴퓨터입니다.
         */

        Scanner scanner = new Scanner(System.in);

        // Case 1 (else-if)
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? >>", i+1, words[i][0]);
            String input = scanner.nextLine();
            if("의자".equals(input)) {
                System.out.printf("정답입니다.. 정답은 %s입니다.\n", words[i][1]);
            }
            else if ("컴퓨터".equals(input)) {
                System.out.printf("정답입니다. 정답은 %s입니다.\n", words[i][1]);
            }else if ("정수".equals(input)) {
                System.out.printf("정답입니다. 정답은 %s입니다.\n", words[i][1]);
            }else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
            }
        }

        // Case 2 (switch)
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? >>", i+1, words[i][0]);
            String input = scanner.nextLine();
            switch (input){
                case "컴퓨터":
                    System.out.printf("정답입니다.. 정답은 %s입니다.\n", words[i][1]);
                    break;
                case "의자":
                    System.out.printf("정답입니다. 정답은 %s입니다.\n", words[i][1]);
                    break;
                case "정수":
                    System.out.printf("정답입니다. 정답은 %s입니다.\n", words[i][1]);
                    break;
                default:
                    System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
            }
        }

        // Case 3 (2중반복문, if else문-break)
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? >>", i+1, words[i][0]);
            String input = scanner.nextLine();
            for (int j = 0; j < words[i].length; j++) {
                if(input.equals(words[i][1])){
                    System.out.printf("정답입니다. 정답은 %s입니다.\n", words[i][1]);
                }else {
                    System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
                }
                break;
            }
        }

        // Case 4 (반복문, if문-continue)
        for (int i = 0; i < words.length; i++) {
            String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은? >> ", i+1, wordArr[0]);
            String answer = scanner.nextLine();
            String experctedAnswer = wordArr[1];
            if(answer.equals(experctedAnswer)){
                System.out.printf("오답입니다. 정답은 %s입니다.\n", experctedAnswer);
                continue;
            }
            System.out.println("정답입니다.");
        }
        System.out.println("끝");

        // Case 5 (반복문, 삼항식)
        for (int i = 0; i < words.length; i++) {
            String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은? >> ", i+1, wordArr[0]);
            String answer = scanner.nextLine();
            String experctedAnswer = wordArr[1];
            System.out.printf( (answer.equals(experctedAnswer)) ? "정답입니다.\n" : "오답입니다. 정답은 %s입니다.\n", experctedAnswer );
        }
        System.out.println("끝");

        // Case 6 (향상된 for문)
        int i = 1;
        for (String[] wordArr: words) {
            System.out.printf("Q%d. %s의 뜻은? >> ", i++, wordArr[0]);
            String answer = scanner.nextLine();

            String experctedAnswer = wordArr[1];
            if(answer.equals(experctedAnswer)){
                System.out.printf("오답입니다. 정답은 %s입니다.\n", experctedAnswer);
                continue;
            }
            System.out.println("정답입니다.");
        }
    }
}