/*
 * Name: Brendan Tea
 * Date: September 31, 2025
 * Description: Prints out area of triangle based on base and height
 * 
 */
import java.util.Scanner;

public class area {
    // This main method is to initialize variables and run the method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double base = s.nextDouble(), height = s.nextDouble();
       // Double height = s.nextDouble();

        Double k = AreaTriangle(base, height);
        System.out.printf("Area of triangle (base=%2.1f, height=%2.1f) is %2.1f", base, height, k);
    }

    // This method is output area of triangle
    public static double AreaTriangle(Double base, Double height) {
        return 0.5 * base * height;
    }
}