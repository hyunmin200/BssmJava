package ch16.dotCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class GameHelper {
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    private int[][] grid = new int[7][7];
    private int comCount;

    public String getUserInput(String prompt) {
        String inputLine;
        System.out.print(prompt + " ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDotCom() {
        ArrayList<String> alphaCells = new ArrayList<>();
        int randY=0; // 0 ~ 6 사이가 나옴
        int randX=0;
        comCount++;

        if(comCount % 2 == 1){
            // 가로
            while(true){
                randY = (int)(Math.random() * 1000) % 7;
                randX = (int)(Math.random() * 1000) % 5;
                if((grid[randY][randX] == 0) && (grid[randY][randX + 1] == 0) && (grid[randY][randX + 2] == 0)){
                    grid[randY][randX] = 1;
                    grid[randY][randX + 1] = 1;
                    grid[randY][randX + 2] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[randY]+"%d", randX)); //a0, a1
            alphaCells.add(String.format(alphabet[randY]+"%d", randX + 1)); //a0, a1
            alphaCells.add(String.format(alphabet[randY]+"%d", randX + 2)); //a0, a1
        } else{
            // 세로
            while(true){
                randY = (int)(Math.random() * 1000) % 5;
                randX = (int)(Math.random() * 1000) % 7;
                if((grid[randY][randX] == 0) && (grid[randY + 1][randX] == 0) && (grid[randY + 2][randX] == 0)){
                    grid[randY][randX] = 1;
                    grid[randY + 1][randX] = 1;
                    grid[randY + 2][randX] = 1;
                    break;
                }
            }
            alphaCells.add(alphabet[randY] + Integer.toString(randX)); //a0, a1
            alphaCells.add(alphabet[randY+1] + Integer.toString(randX)); //a0, a1
            alphaCells.add(alphabet[randY+2] + Integer.toString(randX)); //a0, a1
//            alphaCells.add(String.format(alphabet[randX]+"%d", randY)); //a0, a1
//            alphaCells.add(String.format(alphabet[randX]+"%d", randY + 1)); //a0, a1
//            alphaCells.add(String.format(alphabet[randX]+"%d", randY + 2)); //a0, a1
        }
        
        return alphaCells;
    }

    public void printAll() {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}