
public class q5 {
    public static void main(String[] args) {
        int howMany = 7;
        String s1 = "^";
        String s2 = "*";

        for (int i = 1; i <= howMany; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(s1);
            }

            for (int k = 1; k <= howMany - i; k++) {
                System.out.print(s2);
            }

            System.out.println();
        }

    }
}