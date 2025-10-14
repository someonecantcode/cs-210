/*
 * Name: Brendan Tea
 * Date: October 1, 2025
 * Description: Obtains string input and displays info
 * 
 */

import java.util.Scanner;

public class q2 {
    // This main method is to initialize scanner and run the method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a string:  ");
        dataVomit(s.nextLine());
        s.close();
    }

    // This method is takes displays info about the string.
    public static void dataVomit(String s) {
        System.out.printf(
                "%nString: %s %nlength: %d " +
                "%nfirst character: %c " +
                "%nlast character: %c " +
                "%nfirst three characters: %s " +
                "%nfirst last three characters: %s " +
                "%nupper case: %s " +
                "%nlower case: %s " +
                "%nthe first and the last character is %s the same %n%s",
                s,
                s.length(),
                s.charAt(0),
                s.charAt(s.length() - 1),
                s.substring(0, 3),
                s.substring(s.length() - 3),
                s.toUpperCase(),
                s.toLowerCase(),
                s.charAt(0) == s.charAt(s.length() - 1) ? "not" : "",
                s.length() >= 10 ? "the " + s + " is too long" : "the " + s + " is acceptable");
    }
}