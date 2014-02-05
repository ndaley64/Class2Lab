package model;

/**
 *
 * @author Nathaniel
 */
public class CalculatorService {  
    public double getRectangleArea(double length, double width){
        return length * width;
    }
    public double getCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getTriangleArea(double base, double height){
        return (.5 * (base * height));
    }
}
