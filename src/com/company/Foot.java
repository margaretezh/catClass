package com.company;

public class Foot {
    private double length;
    private double fluffiness;

    public Foot(double l, double f) {
        length = l;
        fluffiness = f;
    }
    public Foot(Foot source) {
        this.length = source.length;
        this.fluffiness = source.fluffiness;
    }
    public Foot() {
        length = 1;
        fluffiness = 1;
    }
    public void print() {
        System.out.println("+---+");
        System.out.print("length = ");
        System.out.println(length);
        System.out.print("fluffiness = ");
        System.out.println(fluffiness);
        System.out.println("+---+");
    }
    public void cutHair(double amount) {
        fluffiness -= amount;
    }
}
