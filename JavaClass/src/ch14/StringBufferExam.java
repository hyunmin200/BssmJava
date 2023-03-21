package ch14;

public class StringBufferExam {
    public static void main(String[] args) {
        String str1 = "busan ";
        System.out.println(str1.hashCode());
        String str2 = "meister";
        str1 = str1 + str2;
        System.out.println(str1.hashCode());
        System.out.println(str1);

        StringBuffer sb1 = new StringBuffer("busan");
        StringBuffer sb2 = new StringBuffer("meister");
        System.out.println(sb1.hashCode());
        sb1.append(sb2);
        System.out.println(sb1.hashCode());
        System.out.println(sb1);

        sb1.replace(0, 5, "BUSAN");
        System.out.println(sb1);
        System.out.println(sb1.reverse());
    }
}
