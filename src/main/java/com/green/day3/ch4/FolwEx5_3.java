package com.green.day3.ch4;
// 문서서식 전체 - ctrl shift alt l
// 문서서식 드레그한 부분만 - ctrl alt l
// if, else 만 있으면 삼항연상자를 이용
import java.util.Scanner;

public class FolwEx5_3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("정수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // score 값이 90보다 같거나 크면 A학점출력
        // score 값이 80보다 같거나 크면 B학점출력
        // 1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        // 나머지는 C학점 출력

        // 예를 들어 98 점 > A+ 출력
        // 예를 들어 83 점 > B- 출력
        // 예를 들어 75 or 79 or 71 점 > C 출력
        String grade = "C";
        String opt = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {
            int rMod = score % 10; // 첫번째 자리를 캐치하고 싶다? > % 10
            if (rMod >= 8 || score == 100){
                opt = "+";
            } else if (score % 10 <= 3) {
                opt = "-";
            }
        }
        System.out.printf("%s %s학점", grade, opt);
    }
}
