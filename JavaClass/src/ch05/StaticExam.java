package ch05;

public class StaticExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.showInfo();
        Student.group = "embadded";
        s2.showInfo();
        s3.showInfo();
    }
}
