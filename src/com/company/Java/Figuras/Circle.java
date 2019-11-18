package com.company.Java.Figuras;

import com.company.Java.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
