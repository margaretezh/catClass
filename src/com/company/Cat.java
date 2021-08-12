package com.company;

public class Cat {
    private Foot backLeft;
    private Foot backRight;
    private Foot frontLeft;
    private Foot frontRight;
    private int eyeCount;

    public Cat(Foot bl, Foot br, Foot fl, Foot fr, int eye) {
        setBackLeft(new Foot(bl));
        setBackRight(new Foot(br));
        setFrontLeft(new Foot(fl));
        setFrontRight(new Foot(fr));
        eyeCount = eye;
    }

    public Cat(Cat source) {
        this.setBackLeft(new Foot(source.getBackLeft()));
        this.setBackRight(new Foot(source.getBackRight()));
        this.setFrontLeft(new Foot(source.getFrontLeft()));
        this.setFrontRight(new Foot(source.getFrontRight()));
        this.eyeCount = source.eyeCount;
    }

    public Cat() {
        setBackLeft(new Foot());
        setBackRight(new Foot());
        setFrontLeft(new Foot());
        setFrontRight(new Foot());
        eyeCount = 2;
    }

    public void print() {
        System.out.println("=====");
        getBackLeft().print();
        getBackRight().print();
        getFrontLeft().print();
        getFrontRight().print();
        System.out.print("eyeCount = ");
        System.out.println(eyeCount);
        System.out.println("=====");
    }

    public void trim(double amount) {
        getBackLeft().cutHair(amount);
        getBackRight().cutHair(amount);
        getFrontLeft().cutHair(amount);
        getFrontRight().cutHair(amount);
    }

    public Foot getBackLeft() {
        return backLeft;
    }

    public void setBackLeft(Foot backLeft) {
        this.backLeft = backLeft;
    }

    public Foot getBackRight() {
        return backRight;
    }

    public void setBackRight(Foot backRight) {
        this.backRight = backRight;
    }

    public Foot getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(Foot frontLeft) {
        this.frontLeft = frontLeft;
    }

    public Foot getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(Foot frontRight) {
        this.frontRight = frontRight;
    }
}
