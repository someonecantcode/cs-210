import java.util.Scanner;

public class practice2 {
    public static int minLength, maxLength;

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

        System.out.println("USAU has been successfully created!");
        s.close();
    }

    public static Boolean metReqs(String id) {
        Boolean output = true;

        if (id.equals("")) {
            return false;
        }

        if (id.length() < minLength || id.length() > maxLength) {
            System.out.printf("ID must be greater than or equal to %d and less than or equal to %d %n",
                    minLength,
                    maxLength);
            output = false;
        }

        if (id.charAt(0) != id.charAt(id.length() - 1)) {
            System.out.println("The first character and the last character must be the same");
            output = false;
        }

        return output;
    }

}