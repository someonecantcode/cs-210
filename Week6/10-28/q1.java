/*
 * Name: Brendan Tea
 * Date: October 28th, 2025
 * Description: Prints out left and right aligned float
 * 
 */

class shape {
    private int width;
    private int height;

    shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

}

public class q1 {
    public double m(double a, double b){
        return a - b;
    }

    public static void main(String[] args) {
        shape s1 = new shape(2, 3);
        shape s2 = new shape(4,5);
        System.out.println(s1.getArea());
           System.out.println(s2.getArea());
    }
}