/*
 * Name: Brendan Tea
 * Date: October 7th, 2025
 * Description: Grabs two integer numbers and quizzes the sum.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class q2 {
    // Main class grabs input
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input Max ");
        int max = s.nextInt();
        System.out.print("Input Min ");
        int min = s.nextInt();

        int randomNumber1 = randomIntRange(min, max);
        int randomNumber2 = randomIntRange(min, max);

        System.out.print("Input operator: ");
        String operator = s.next();
        int input;
        while (true) {
            System.out.printf("%d %s %d = ?%n", randomNumber1, operator, randomNumber2);
            input = s.nextInt();

            if (input == math(operator, randomNumber1, randomNumber2)) {
                break;
            }
            System.out.println("Wrong answer!");
        }
        System.out.print("You are a Math genius!");
        s.close();

    }

    // Grabs random number number from min and max

    public static int randomIntRange(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    // Returns operator of two numbers.
    public static int mathswitch(String op, int num1, int num2) { 
        switch (op) { //bad memory
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return num1 + num2;
        }
    }

    public static int math(String op, int num1, int num2) {
        if (op.equals("+")) {
            return num1 + num2;
        }
        if (op.equals("-")) {
            return num1 - num2;
        }
        if (op.equals("*")) {
            return num1 * num2;
        }
        if (op.equals("/")) {
            return num1 / num2;
        }
        return 0;
    }

}