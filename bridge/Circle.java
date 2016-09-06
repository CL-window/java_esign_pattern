package com.cl.slack.bridge;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 17:01 .
 */
public class Circle extends Shape {
    public Circle(Drawing drawing) {
        super(drawing);
    }
    @Override
    public void draw() {
        drawCircle();
    }
}
