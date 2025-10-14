/*
 * Name: Brendan Tea
 * Date: October 7th, 2025
 * Description: Asks for two numbers and checks if meets criteria
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class q1 {
    // Main function grabs input from user and calls methods.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        do {
            System.out.print("\ninput first number: ");
            n1 = s.nextInt();

            System.out.print("input second number: ");
            n2 = s.nextInt();
        } while (!metReqs(n1, n2));
        System.out.printf("%nYour random number between %d and %d is %d", n2, n1, randomIntRange(n1, n2));
        s.close();
    }

    // Checks if user integer inputs meet the requirements.
    public static Boolean metReqs(int n1, int n2) {
        Boolean condition = true;

        if (n1 == n2) {
            System.out.println("Can't be the same. Input again");
            condition = false;
        }

        if (n1 < 0 || n2 < 0) {
            System.out.println("Must be >= 0. Input again");
            condition = false;
        }

        if (n1 > 99 || n2 > 99) {
            System.out.println("Must be <= 99. Input again");

            condition = false;
        }

        return condition;
    }

    // random function that allows to grab from min max. automatically sets the larger parameter to max.
    public static int randomIntRange(int n1, int n2) {
        int max = (n2 > n1) ? n2 : n1;
        int min = (n1 + n2) - max;
        return new Random().nextInt(max - min + 1) + min;
    }

}