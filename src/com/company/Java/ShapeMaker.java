package com.company.Java;

import com.company.Java.Figuras.Circle;
import com.company.Java.Figuras.Rectangle;
import com.company.Java.Figuras.Square;

//Fachada
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void  drawSquare(){
        square.draw();
    }
}
