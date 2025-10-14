import  java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int first = r.nextInt(10);
        int second = r.nextInt(10);
        int answer = first + second;

        int userAnswer = -1;
        do {
            if (userAnswer != -1) {
                System.out.println("Wrong Answer");
            }

            System.out.printf("%d+%d = ?%n", first, second);
            userAnswer = s.nextInt();
        } while(userAnswer != answer); 
        System.out.print("You are a Math genius!");
    }
}