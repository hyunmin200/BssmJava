package ch15.SimpleDotCom;

public class SimpleDotCom {
    private int[] location;

    int numOfHits;


    public void setLocation(int[] location) {
        this.location = location;
    }

    public String checkYourself(String guessStr) {
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
    }
}
