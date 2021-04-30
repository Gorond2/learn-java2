package org.example.box;

public class Bol <T>{
    private T radius;

    public Bol(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }
}
