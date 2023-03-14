package ch04;

public class Student {
    int age;
    int num;
    String name;

    void study(){
        System.out.println("공부하기");
    }

    void eating() {
        System.out.println("밥 먹기");
    }

    void sleeping(){
        System.out.println("잠자기");
    }

    void showInfo(){
        System.out.print("이름은 " + name + "이고, ");
        System.out.print("나이는 " + age + "이고, ");
        System.out.println("학번은 " + num + "입니다. ");
    }
}
