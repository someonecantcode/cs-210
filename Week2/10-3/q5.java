/*
 * Name: Brendan Tea
 * Date: October 3rd, 2025
 * Description: testing mystery function
 * 
 */

public class q5 {

    // Outputs the values of pi in varying ranges.
    public static void main(String[] args) {
        mystery(2,5);
    }

    public static void mystery(int a, int b) {
        if (a < b * 2) {
            a += 2;
            b -= 3;
        } else if (a == b * 2) {
            a *= 2;
            b += 5;
        } else {
            a -= 3;
        }
        if (a >= 10 && b >= 10) {
            a -= 10;
            b -= 10;
        }

        System.out.println(a + " " + b);
    }
}
