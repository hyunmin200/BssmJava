package ch15;

import java.io.IOException;

public class StreamExam {
    public static void main(String[] args) {
        int a;
        try {
            while((a = System.in.read()) != -1)
            System.out.print((char)a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
