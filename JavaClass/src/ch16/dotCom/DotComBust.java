package ch16.dotCom;

import java.util.ArrayList;

public class DotComBust {
    private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
    private GameHelper gameHelper = new GameHelper();
    private int numOfGuesses;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void startPlaying() {
        while(!dotComs.isEmpty()){
            String userGuess = gameHelper.getUserInput("enter a guess");
            checkUserGuess(userGuess);
            System.out.println(dotComs);
        }

        finishGame();
    }

    private void finishGame() {
        System.out.println(numOfGuesses +" guesses");
        if(numOfGuesses <= 18){
            System.out.println("Good Job!");
        }
        else{
            System.out.println("^ㅡ^");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for(DotCom dotcom : dotComs){
            result= dotcom.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComs.remove(dotcom);
                break;
            }
        }

        System.out.println(result);
    }

    private void setUpGame() {
        //dotcom생성
        dotComs.add(new DotCom("google.com"));
        dotComs.add(new DotCom("abc.com"));
        dotComs.add(new DotCom("naver.com"));
        //dotcom 위치값 추가
        for(DotCom dotCom : dotComs){
            //dotCom.setLocation();
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation((newLocation));
        }

        gameHelper.printAll();
    }
}
