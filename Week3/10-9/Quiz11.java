/*
 * Name: Brendan Tea
 * Date: October 9th, 2025
 * Description: Improving boolean zen with do-while loops
 *  
 */

import java.util.Scanner;

public class Quiz11 {
    static Scanner s = new Scanner(System.in);

    // Main method obtaining input until requirements are met.
    public static void main(String[] args) {
        int first, second, third;

        do {
            System.out.print("input first number ");
            first = s.nextInt();

            System.out.print("input second number ");
            second = s.nextInt();

            System.out.print("input third number ");
            third = s.nextInt();

            if (checkNumbers(first, second, third)) {
                break;
            }
            System.out.println("\nInput again.");
        } while (true);
        System.out.print("you are a genius, bye!");
        s.close();
    }

    // Returns if 3 numbers meet criteria;
    public static Boolean checkNumbers(int first, int second, int third) {
        return ((first == second) && (first + second < third));
    }
}