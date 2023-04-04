package ch16.Generic;

public class GenericExam {
    public static void main(String[] args) {
        Powder powder = new Powder();
//        System.out.println(powder);

        Plastic plastic = new Plastic();
        ThreeDPrinterPowder threeDPrinterPowder = new ThreeDPrinterPowder();
        threeDPrinterPowder.setMaterial(powder);
        System.out.println(threeDPrinterPowder);

        System.out.println("==========================");

        ThreeDPrinterObject threeDPrinterObject = new ThreeDPrinterObject();
        threeDPrinterObject.setMaterial(powder);
        System.out.println(threeDPrinterObject);
        threeDPrinterObject.setMaterial(plastic);
        System.out.println(threeDPrinterObject);

        System.out.println("==========================");

        Water water = new Water();
        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric();
        threeDPrinterGeneric.setMaterial((plastic));
        System.out.println(threeDPrinterGeneric.getMaterial());
    }
}
