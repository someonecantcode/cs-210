import java.util.Scanner;
import java.util.Random;

public class practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input Max ");
        int max = s.nextInt();
        System.out.print("Input Min ");
        int min = s.nextInt();

        // range = (max - min + 1 )
        // range = max - min + 1
        int randomNumber1 = randomIntRange(min, max);
        int randomNumber2 = randomIntRange(min, max);

        int input;
        while (true) {
            System.out.printf("%d+%d = ?%n", randomNumber1, randomNumber2);
            input = s.nextInt();

            if (input == adder(randomNumber1, randomNumber2)) {
                break;
            }
            System.out.println("Wrong answer!");
        }
        System.out.print("You are a Math genius!");
        s.close();

    }

    public static int randomIntRange(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int adder(int num1, int num2) {
        return num1 + num2;
    }
}