/*
 * Name: Brendan Tea
 * Date: October 3rd, 2025
 * Description: Prints out left and right aligned float
 * 
 */

public class q2 {

    // Outputs the values of pi in varying ranges.
    public static void main(String[] args) {
        Double pi = 3.14159265359;

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%12." + i + "f %n", pi);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%12." + i + "f %n", pi);
        }

    }
}
