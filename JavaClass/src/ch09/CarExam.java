package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car k3 = new Car("white", "kia", "k3");

        k3.StartCar();
        k3.speedUp();
        k3.speedDown();
        k3.StopCar();

        Taxi taxi = new Taxi("black", "hyundai", "avante");
        taxi.showInfo();
        taxi.meterUp();
        taxi.stopMeter();
    }
}
