import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println(s.nextInt());
            System.out.println(s.nextDouble());
            // System.out.println(s.next());
            System.out.println(s.nextLine());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            
        }

    }
}