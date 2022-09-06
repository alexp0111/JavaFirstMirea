package ru.mirea.task2.par1;

import java.awt.*;

public class Shape {
    private String type;
    private double area;
    private Color color;

    public Shape(String type, double area, Color color) {
        this.type = type;
        this.area = area;
        this.color = color;
    }

    public Shape() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", area=" + area +
                ", color=" + color +
                '}';
    }
}
