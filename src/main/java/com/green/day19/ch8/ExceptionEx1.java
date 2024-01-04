package com.green.day19.ch8;
// 다른 플랫폼들(java javascript)간 통신할 때 선로를 깝니다.
// 다 쓰고 에러가 발생했어도 finally로 무조건 실행하여 선로를 부십니다.
public class ExceptionEx1 {
    public static void main(String[] args) {// try catch는 필수입니다.
        int num = 0;
        // num = num / 0;
        try{
            num = 10;
            num = num / 0; // 모든 언어는 다 에러가 뜹니다.
        }catch (Exception e){ //예외가 터지면 catch문이 작동합니다. 에러없으면 실행x
            e.printStackTrace(); // error를 주는 매서드입니다.(생각x)
            System.out.println("예외 발생!!");
            num = -1;
        } finally { //finally는 옵션입니다. 그리도 **반드시 실행합니다.
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}
class ExceptionEx1_2{
    public static void main(String[] args) {
        div(10);
    }
    public static void div(int num){
        try{
            num = 10;
            return; // ***return이 있음에도 finally는 무조건 실행합니다.
        }catch (Exception e){ //예외가 터지면 catch문이 작동합니다. 에러없으면 실행x
            e.printStackTrace(); // error를 주는 매서드입니다.(생각x)
            System.out.println("예외 발생!!");
            num = -1;
        } finally { //finally는 옵션입니다. 그리도 **반드시 실행합니다.
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_3{
    public void sum(){}
    public static void main(String[] args) {// 분기문으로 사용해서 코드를 짤 수도 있습니다.
        try {
            //int num = 10 / 0;
            //ExceptionEx1_3 obj = null;// 널포인트 예외
            //obj.sum();
            int[] arr = new int[10]; // 아우더리바운드 예외
            arr[10] = 10;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // 이 중에 하나만 예외가 실행됩니다.
            System.out.println("수학적 예외");// 위와같은 경우 | 하나만 사용합니다.

        }catch (NullPointerException e){
            System.out.println("널포인트 예외;");
        }catch (Exception e){ // Exception 은 가장 마지막에 있어야합니다.
            System.out.println("모든 예외");
        }
        System.out.println("끝!!!");
    }
}