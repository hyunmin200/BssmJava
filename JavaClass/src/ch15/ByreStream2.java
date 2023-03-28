package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class ByreStream2 {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        int a;

        try{
            while((a = bi.read()) != -1){
                bo.write(a);
            }
            bo.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
