package com.company;

public class Printer {
    private int tunerLevel;
    private int numberOfPages;
    private boolean duplexPrinter = false;

    public Printer(int tunerLevel, boolean duplexPrinter) {
        this.tunerLevel = tunerLevel;
        this.numberOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int ink) {
        if (tunerLevel + ink <= 100) {
            tunerLevel = tunerLevel + ink;
            System.out.println("Tuner Level: " + tunerLevel);
        } else {
            System.out.println("Tuner Level 100");
        }
    }

    public void simulatePrinting(int newPage) {
        System.out.println("Previous Pages " + numberOfPages);
        numberOfPages = numberOfPages + newPage;
        if (duplexPrinter == false) {
            System.out.println("New pages " + newPage + " Sum of Pages " + numberOfPages);
        } else {
            System.out.println("New pages " + newPage + " Sum of Pages " + numberOfPages / 2);
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
