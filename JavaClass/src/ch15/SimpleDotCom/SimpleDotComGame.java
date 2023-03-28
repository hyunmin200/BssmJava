package ch15.SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        // 1. SimpleDotCom 클래스의 인스턴스 만들기
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        // 2. 위치 대입하기
        //int[] location = {2,3,4};
        ArrayList<Integer> location = new ArrayList<>();
        location.add(2);
        location.add(3);
        location.add(4);
        simpleDotCom.setLocation(location);
        // 3. 사용자가 추측한 위치를 나타내는 String 변수 선언
        String guess = "2";
        // Integer.parseInt(guess) -> 형변환
        // 4. 3단계에서 만든 변수 전단 : checkYourself()
        String result1 = simpleDotCom.checkYourself("2");
        String result2 = simpleDotCom.checkYourself("3");
        String result3 = simpleDotCom.checkYourself("4");
        // 5. 결과 출력 (hit/ miss/ kill)
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
