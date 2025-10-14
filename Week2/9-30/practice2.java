import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        dataVomit(s.nextLine());
    }

    public static void dataVomit(String s) {
        System.out.printf("String: %s %nlength: %d %nfirst character: %c %nlast character: %c %nfirst three characters: %s %nfirst last three characters: %s %nupper case: %s %nlower case: %s",
                    s,
                    s.length(),
                    s.charAt(0),
                    s.charAt(s.length()-1),
                    s.substring(0,3),
                    s.substring(s.length()-3),
                    s.toUpperCase(),
                    s.toLowerCase()
                    );
    }
}