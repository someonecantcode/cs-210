/*
 * Name: Brendan Tea
 * Date: October 1, 2025
 * Description: Obtains two integer inputs and outputs average
 * 
 */

import java.util.Scanner;

public class q1 {
    // This main method is to initialize scanner and run the method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input first number (integer) : ");
        int n1 = s.nextInt();

        System.out.print("Input second number (integer) : ");
        int n2 = s.nextInt();

        s.close();
        System.out.printf("%n Average of %d and %d = %2.1f", n1, n2, average(n1, n2));
    }

    // This method is takes two integer inputs and returns the average.
    public static double average(int a, int b) {
        return 0.5 * (a + b);
    }

}