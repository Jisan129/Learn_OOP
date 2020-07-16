package com.company;

import java.util.ArrayList;

class GearBox {
    private int currentGear;
    public static final String test = "hello";
    ArrayList<Gear> gears;
    static boolean i_m_here = true;
    private boolean clutch;

    public GearBox(int currentGear) {
        this.currentGear = currentGear;
        this.gears = new ArrayList<Gear>();
        Gear Neural = new Gear(0, 0.0);
        this.clutch = false;
    }

    private static boolean getGears() {
        return i_m_here;
    }

    public static class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public void setGearNumber(int gearNumber) {
            this.gearNumber = gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

        public double revolution() {
            return gearNumber * (this.ratio);
        }
    }
}
