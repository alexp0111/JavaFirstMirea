package ru.mirea.task3.humans;

public class Head {
    private double length;
    private double weight;

    public Head(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public Head() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Head{" +
                "length=" + length +
                ", weight=" + weight +
                '}';
    }
}
