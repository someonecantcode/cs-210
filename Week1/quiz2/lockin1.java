/*
 * Name: Brendan Tea
 * Date: September 29, 2025
 * Description: Prints out area of triangle based on base and height
 * 
 */

public class lockin1 {
    // This main method is to initialize variables and run the method
    public static void main(String[] args) {
        Double b = 300.0;
        Double h = 5.0;

        AreaTriangle(b, h);
    }

    // This method is output area of triangle
    public static void AreaTriangle(Double base, Double height) {
        System.out.println(base);
        System.out.printf("Area of triangle (base=%2.1f, height=%2.1f) is %2.1f", base, height, 0.5 * base * height);
    }
}