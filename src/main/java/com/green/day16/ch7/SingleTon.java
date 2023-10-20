package com.green.day16.ch7;
//SingleTon 기법
public class SingleTon {
    private SingleTon(){} // 이 생성자는 내부에서만 접글 할 수 있게됩니다. 내부에선 생성자호출할수있지만 외부에선 안됩니다.
    private static SingleTon singleTon; //클래스 내부에 static으로 유일한 인스턴스를 생성합니다.
    public static SingleTon getInstance(){ // get매서드로 내부에서 항상 같은 객체생성
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}

class SingleTonTest{
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance(); // getInstance() -스태틱매소드
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1 == s2); // 생각해보기 >>               동일한 객체를 갖고 있습니다.
        //SingleTon s1 = new SingleTon();

    }
}