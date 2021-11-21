package com.company.classes.figures;

import java.util.Objects;

public class Circle implements Comparable<Circle>{
    private double radius;
    private String color = "red";

    public Circle() {
        this(100.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle getCurrentObject(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius == o.radius) {
            return 0;
        } else {
            return this.radius > o.radius ? 1 : -1;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
