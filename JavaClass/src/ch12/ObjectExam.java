package ch12;

public class ObjectExam {
    public static void main(String[] args) {
        String str1 = "busan";
        String str2 = "busan";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("meister");
        String str4 = new String("meister");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        Student s1 = new Student(1, "hwang");
        Student s2 = new Student(1, "hwang");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
