package com.example.telusko;

public class Gate {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "color='" + color + '\'' +
                '}';
    }
}
