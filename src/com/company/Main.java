package com.company;

public class Main {

    public static void main(String[] args) {
        Foot foot1 = new Foot();
        Foot foot2 = new Foot(2, 10);

        //foot1.print();
        //foot2.print();
        //System.out.println("--------------------");

        Cat cat1 = new Cat();
        Cat cat2 = new Cat(foot2, foot2, foot1, foot1, 3);

        footModifier.swapFeet(cat1, cat2);

        cat1.print();
        cat2.print();
    }
}
