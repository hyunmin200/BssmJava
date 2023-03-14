package ch07;

public class PrivateExam {
    public static void main(String[] args) {
        Student hwang = new Student();
        hwang.setName("HwangHyunMin");
        System.out.println(hwang.getName());

        System.out.println(Student.getCount());
    }
}
