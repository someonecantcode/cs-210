
/*
 * Name: Brendan Tea
 * Date: October 23rd, 2025
 * Description: Takes two shape inputs and calculates proportionality difference.
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

// Shape class to that stores the specific shape type and area.
class shape {
    String shapetype;
    double area;

    public shape(String shapetype, double area) {
        this.shapetype = shapetype;
        this.area = area;
    }
}

public class myShape {
    static Scanner s = new Scanner(System.in);
    static Area areaObject = new Area();
    static final int NUM_SHAPES = 2;

    // Takes 2 shape inputs and stores into array of them. Calculates Area.
    public static void main(String[] args) {
        ArrayList<shape> s_array = new ArrayList<>();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int input = getInput();
            String shapetype = (input == 1) ? "Triangle" : "Circle";
            double area = calculate(input, getShapeData(input));
            s_array.add(new shape(shapetype, area));
        }

        for (shape temp_shape : s_array) {
            System.out.printf("%s Area: %.2f %n", temp_shape.shapetype, temp_shape.area);
        }

        boolean larger = s_array.get(0).area > s_array.get(1).area;
        String largerShape = (larger) ? s_array.get(0).shapetype : s_array.get(1).shapetype;
        String smallerShape = (!larger) ? s_array.get(0).shapetype : s_array.get(1).shapetype;
        Double diff = (larger) ? s_array.get(0).area / s_array.get(1).area : s_array.get(1).area / s_array.get(0).area;
        System.out.printf("The %s is %.2f larger than %s", largerShape, diff, smallerShape);
        s.close();
    }

    // Takes shape input
    public static int getInput() {
        System.out.print("Define first shape 1) triangle, 2)circle): ");
        int input = s.nextInt();

        return input;
    }

    // Takes shape input and stores shape data.
    public static int[] getShapeData(int input) {
        int[] output = new int[2];

        if (input == 1) {
            System.out.print("Triangle Base: ");
            output[0] = s.nextInt();

            System.out.print("Triangle Height: ");
            output[1] = s.nextInt();
        }

        if (input == 2) {
            System.out.print("Circle radius: ");
            output[0] = s.nextInt();
        }

        System.out.println();
        return output;
    }

    // Takes shape data & shape type and calculates area
    public static double calculate(int input, int[] data) {
        return (input == 1) ? areaObject.triArea(data[0], data[1]) : areaObject.circleArea(data[0]);
    }

}