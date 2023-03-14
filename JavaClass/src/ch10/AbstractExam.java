package ch10;

public class AbstractExam {
    public static void main(String[] args) {
        MyShip myShip = new MyShip("동해선");

        myShip.startShip();
        System.out.println(myShip.maxPassengers());
        System.out.println(myShip.maxLuggage());
    }
}
