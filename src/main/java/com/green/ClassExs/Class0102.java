package com.green.ClassExs;
/*
위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.

· 필드를 모두 private로 하고, getter와 setter를 구현하고

· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
 */
import java.util.Scanner;

/*
 * 다음을 만족하는 Student 클래스를 작성하시오
 * String 형의 학과와 정수형의 학번을 필드로 선언
 * Student 클래스의 main()메소드에서 Student 객체를 생성하여 학과와 학번 필드에
 * 적당한 값을 입력한 후 출력
 * 2. 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
  필드를 모두 private로 하고, getter와 setter를 구현하고
  Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여
    학과와 학번 필드에 적당한 값을 입력 후 출력
 */
public class Class0102 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int classC = scanner.nextInt();
        student.setClassName(name, classC);

        // student.setClassName("건축과", 1);
        System.out.printf("학과 : %s, 반 : %d", student.getClassName(), student.getClassC());

    }
}
class Student{
    static private String className;
    static private int classC;
    static int c=0;
    void setClassName(){

    }
    public void setClassName(String className, int classC){
        this.className = className;
        this.classC = classC;
    }
    public String getClassName(){
        return this.className;
    }
    public int getClassC(){
        return classC;
    }
}