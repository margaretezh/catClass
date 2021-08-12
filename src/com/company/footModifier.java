package com.company;

public class footModifier {
    public static void swapFeet(Cat cat1, Cat cat2) {
        Cat buffer = new Cat(cat1);

        cat1.setBackLeft(cat2.getBackLeft());
        cat1.setBackRight(cat2.getBackRight());
        cat1.setFrontLeft(cat2.getFrontLeft());
        cat1.setFrontRight(cat2.getFrontRight());

        cat2.setBackLeft(buffer.getBackLeft());
        cat2.setBackRight(buffer.getBackRight());
        cat2.setFrontLeft(buffer.getFrontLeft());
        cat2.setFrontRight(buffer.getFrontRight());
    }
}
