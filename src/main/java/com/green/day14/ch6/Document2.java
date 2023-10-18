package com.green.day14.ch6;

public class Document2 {

    String name;
    static int cnt = 0;

    {
        cnt++;
        System.out.println("인스턴스 초기화 블럭");
    }
    public Document2(){
        //super(); // 생략
        //this("제목없음" + cnt);
        this(String.format("제목없음%d", cnt));
    }
    public Document2(String name){
        //super();
        this.name = name;
        System.out.printf("문서 %s가 생성되었습니다.\n", this.name);
    }
}
class DocumentTest2{
    public static void main(String[] args) {
        Document2 d1 = new Document2(); // 문서 제목없음 1가 생성되었습니다.
        Document2 d2 = new Document2("자바.txt"); // 문서 자바.txt가 생성되었습니다.
        Document2 d3 = new Document2();// 문서 제목없음2가 생성되었습니다.
        Document2 d4 = new Document2();// 문서 제목없음3가 생성되었습니다.
        Document2 d5 = new Document2();// 문서 제목없음4가 생성되었습니다.
    }
}