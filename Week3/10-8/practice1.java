import java.util.Scanner;

public class practice1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int first, second, third;
        
        do { 
            System.out.print("input first number ");
            first = s.nextInt();

            System.out.print("input second number ");
            second = s.nextInt();

            System.out.print("input third number ");
            third = s.nextInt();

            if (checkNumbers(first, second, third)){
                break;
            }
            System.out.println("\nInput again.");
        } while (true);
        System.out.print("you are a genius, bye!");
    }

    public static Boolean checkNumbers(int first, int second, int third) {
        return ((first == second) && (first+second < third));
    }
}