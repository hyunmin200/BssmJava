package ch11;

public class InterfaceExam {
    public static void main(String[] args) {
        Sound tv = new TV();
        Sound radio = new Radio();
        tv.soundUp();
        tv.soundUp();
        tv.soundDown();
        radio.soundUp();
        radio.soundDown();
        radio.soundUp();
        tv.showInfo();
        radio.showInfo();
    }
}
