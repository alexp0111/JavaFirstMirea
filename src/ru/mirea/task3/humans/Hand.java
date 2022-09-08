package ru.mirea.task3.humans;

public class Hand {
    private double length;
    private double weight;

    public Hand(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public Hand() {
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
        return "Hand{" +
                "length=" + length +
                ", weight=" + weight +
                '}';
    }
}
