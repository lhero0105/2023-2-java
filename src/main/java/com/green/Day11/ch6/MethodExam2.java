package com.green.Day11.ch6;

public class MethodExam2 {
/*    String scoreResultOpt(int num) {
        // char grade = 'D';
        // String grade = "없음";

*//*        if (num > 100 || num < 0) {
            return "점수를 확인해 주세요";
        } else if ( num == 100) {
            return "A+학점";
        } else if (num >= 98) {
            return "A+학점";
        } else if (num >= 93) {
            return "A학점";
        } else if (num >= 90) {
            return "A-학점";
        } else if (num >= 88) {
            return "B+학점";
        } else if (num >= 83) {
            return "B학점";
        } else if (num >= 80) {
            return "B-학점";
        }*//*

        // Case 2
        char grade = 'D';
        String a = "";
        if (num >= 90){
            if(num %10 >= 8){
                return "A+학점";
            } else if (num % 10 <= 3) {
                return "A-학점";
            }else {
                return "A학점";
            }
        } else if (num >= 80) {
            if(num %10 >= 8){
                return "B+학점";
            } else if (num % 10 <= 3) {
                return "B-학점";
            } else {
                return "B학점";
            }
        } else if (num >= 70) {
            if(num %10 >= 8){
                return "C+학점";
            } else if (num % 10 <= 3) {
                return "C-학점";
            } else {
                return "C학점";
            }
        } else if (num < 70) {
            return "D학점";
        }


        return "점수를 확인해 주세요";
    }*/



    String scoreResultOpt(int n) {
        if(n < 0 || n > 100) {
            return "점수를 확인해 주세요";
        }
        if(n == 100) {
            return "A+학점";
        } else if(n < 70) {
            return "D학점";
        }
        String grade = "C";
        if(n >= 90) {
            grade = "A";
        } else if(n >= 80) {
            grade = "B";
        }
        //70~99점
        String opt = "0";
        int modVal = n % 10;
        if(modVal >= 8) {
            opt = "+";
        } else if(modVal <= 3) {
            opt = "-";
        }
        return grade + opt + "학점";
    }
    String getSeason(int n){
        String w = "";
        switch (n){
            case 2,3,4:
                w =  "봄";
                break;
            case 5,6,7:
                w = "여름";
                break;
            case 8,9,10:
                w = "가을";
                break;
            case 11,12,1:
                w = "겨울";
                break;
            default:
                return "없음";
        }
        return w;
    }
    String getSeason2(int mon){
        if(mon < 1 || mon > 12){
            return "없음";
        }
        switch (mon){
            case 12, 1, 2:
                return "겨울";
        }
        if (mon >= 9){
            return "가을";
        } else if (mon >= 6) {
            return "여름";
        }
        return "봄";
    }
    String scoreResultOpt2(int n){
        String grade = "D";
        String pm = "";
        if (n > 100 || 0 > n){
            return "점수를 확인해 주세요";
        }
        if (n >= 90){
            grade = "A";
        }else if (n>=80){
            grade = "B";
        } else if (n>=70) {
            grade = "C";
        }else{
            grade = "D";
        }
        if(n/10 >= 8){
            pm = "+";
        } else if (n/10 <= 3) {
            pm = "-";
        }
        return grade + pm + "학점";
    }
}

