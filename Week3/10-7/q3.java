/*
 * Name: Brendan Tea
 * Date: October 7th, 2025
 * Description: Asks for three numbers and checks if meets criteria
 * 
 */

import java.util.Scanner;

public class q3 {
    // Main function grabs input from user.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1, n2, n3;
        do {
            System.out.print("\nPlease input first number: ");
            n1 = s.nextInt();
            System.out.print("Please input second number: ");
            n2 = s.nextInt();
            System.out.print("Please input third number: ");
            n3 = s.nextInt();
        } while (!isValid(n1, n2, n3));

        System.out.println("You are a genius! Bye!");
        s.close();
    }

    public static Boolean isValid(int n1, int n2, int n3) {
        return ((n1 != n2) && ((n1 + n2) < n3));
    }

}