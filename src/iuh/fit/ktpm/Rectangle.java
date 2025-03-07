/*
 *@ (#) Rectangle.java     1.0    28/08/2024
 *
 *  Copyright (c) 2024 IUH.All rights reserved.All rights reserved.
 */
package iuh.fit.ktpm;

/*
 *@description:
 *@author: Tran Duc Nam
 *@date: 28/08/2024
 *@version: 1.0
 */
public class Rectangle {

   private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public  double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
