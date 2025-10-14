/*
 * Name: Brendan Tea
 * Date: October 3rd, 2025
 * Description: Prints out left and right aligned float
 * 
 */

import java.util.Scanner;

public class q3 {
    public static int minLength, maxLength;

    // Main function takes input and checks reqs.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input min length of ID: ");
        minLength = s.nextInt();
        System.out.print("Input max length of ID: ");
        maxLength = s.nextInt();

        String id = "";
        while (!metReqs(id)) {
            System.out.print("\nCreate a new ID: ");
            id = s.next();
        }

        System.out.printf("%s has been successfully created!", id);
        s.close();
    }

    // Reqs function checks if ID meets criteria
    public static Boolean metReqs(String id) {
        Boolean output = true;

        if (id.equals("")) {
            return false;
        }

        if (id.length() < minLength || id.length() > maxLength) {
            System.out.printf("ID must be greater than or equal to %d and less than or equal to %d .%n",
                    minLength,
                    maxLength);
            output = false;
        }

        if (id.length() % 2 == 0) {
            System.out.println("ID must be an odd number.");
            output = false;
        }

        if (id.charAt(0) != id.charAt(id.length() - 1)) {
            System.out.println("The first character and the last character must be the same.");
            output = false;
        }

        return output;
    }

}