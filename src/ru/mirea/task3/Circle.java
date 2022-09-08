package ru.mirea.task3;

public class Circle {

    private double radix;

    public Circle(double radix) {
        this.radix = radix;
    }

    public Circle() {
    }

    public double getRadix() {
        return radix;
    }

    public void setRadix(double radix) {
        this.radix = radix;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radix=" + radix +
                '}';
    }
}
