package ch15.SimpleDotCom;

import ch03.BreakExam;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> location;

    int numOfHits;

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt((guessStr));
        String result = "miss";

        int index = location.indexOf(guess);
        if(index >= 0){
            location.remove(index);
            if(location.isEmpty()){
                return "kill";
            }
            else{
                result = "hit";
            }
        }

        return result;
    }


    /*public void setLocation(int[] location) {
        this.location = location;
    }*/

    /*public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss";

        for (int i : location) {
            if(guess == i){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == location.length){
            result = "kill";
        }

        return result;
    }*/


}
