import java.io.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner s = new Scanner(new File("fileinput.txt"));
        PrintStream out = new PrintStream(new File("output.txt"));

        String readinput = s.nextLine();
        s.close();

        System.out.println(readinput);
        out.println(readinput);

        out.close();
        for(char c ='a'; c<='f'; c++){
            System.out.println(c + " " + (1+c));
        }
        
    }
}