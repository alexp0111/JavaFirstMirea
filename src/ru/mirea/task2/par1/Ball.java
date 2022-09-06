package ru.mirea.task2.par1;

import java.awt.*;

public class Ball {
    private double price;
    private double radius;
    private Color color;

    public Ball(double price, double radius, Color color) {
        this.price = price;
        this.radius = radius;
        this.color = color;
    }

    public Ball() {
    }

    /**
     * In euro
     */
    public double getPrice() {
        return price;
    }

    /**
     * In euro
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * In inch
     */
    public double getRadius() {
        return radius;
    }

    /**
     * In inch
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + price +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}
