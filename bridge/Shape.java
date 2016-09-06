package com.cl.slack.bridge;

/**
 * <p>Description: 保护方法 </p>
 * Created by slack on 2016/8/19 17:01 .
 */
public abstract class Shape {
    //持有实现的角色Implementor(作图类)
    protected Drawing myDrawing;

    public Shape(Drawing drawing) {
        this.myDrawing = drawing;
    }

    abstract public void draw();

    //保护方法drawRectangle
    protected void drawRectangle(){
        //this.impl.implmentation()
        myDrawing.drawRantangle();
    }

    //保护方法drawCircle
    protected void drawCircle(){
        //this.impl.implmentation()
        myDrawing.drawCircle();
    }
}
