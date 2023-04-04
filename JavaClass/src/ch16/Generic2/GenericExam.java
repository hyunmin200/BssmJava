package ch16.Generic2;

public class GenericExam {
    public static void main(String[] args) {
        //타입을 제한
        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        //ThreeDPrinterGeneric<Water> threeDPrinterGenericW = new ThreeDPrinterGeneric<>();
    }
}
