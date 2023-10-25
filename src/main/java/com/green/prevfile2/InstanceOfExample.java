package com.green.prevfile2;

public class InstanceOfExample {
    public static void personInfo(Person person){
        System.out.println("name: " + person.name);
        person.walk();
        if(person instanceof Student){
            Student student = (Student) person;
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
        if(person instanceof Student student){
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("이영웅");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("홍길동", 10);
        personInfo(p2);
    }
}
class Person{
    public String name;
    public  Person(String name){
        this.name = name;
    }
    public void walk(){
        System.out.println("걷습니다.");
    }
}
class Student extends Person{
    public int studentNo;
    public Student(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }
    public void study(){
        System.out.println("공부를 합니다.");
    }
}