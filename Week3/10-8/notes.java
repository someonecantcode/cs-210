
/*
 * Name: Brendan Tea
 * Date: October 8th, 2025
 * Description: Covered boolean zen. HUGE IMPORTANCE ON EXAM
 *              Big data from file.
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class notes {
    // public static type name(params) throws type (exceptions)
    public static void main(String[] args) throws FileNotFoundException {
        // Booleans
        int a = 1;
        int b = 2;
        System.out.println(bothOdd(a, b));

        // read file
        // make sure file location is correct.
        File inputfile = new File("input.txt");
        Scanner fileread = new Scanner(inputfile);
        PrintStream p = new PrintStream(new File("output.txt"));

        while (fileread.hasNext()) {
            String msg = fileread.nextLine();
            System.out.printf("%nwritten %s ", msg);
            p.println(msg);
        }
        fileread.close();
        p.close();

    }

    public static Boolean bothOdd(int n1, int n2) {
        return ((n1 & 1) == 1) && ((n2 & 1) == 1);
    }
}