/*
 * Name: Brendan Tea
 * Date: October 23rd, 2025
 * Description: Area class that calculates circle and triangle area
 * 
 */

import java.lang.Math;

public class Area {

    // Calculates Triangle Area
    public double triArea(double w, double h) {
        return w * h / 2.0;
    }

    // Calculuates Circle Area
    public double circleArea(double r) {
        return (r * r) * Math.PI;
    }
}