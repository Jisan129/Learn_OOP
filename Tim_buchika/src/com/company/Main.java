package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(40, false);
        printer.fillUpToner(50);
        printer.simulatePrinting(40);


        Printer printerNew = new Printer(100, true);
        printerNew.fillUpToner(50);
        printerNew.simulatePrinting(40);

    }
}
