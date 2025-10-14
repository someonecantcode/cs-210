/*
 * Name: Brendan Tea
 * Date: October 1, 2025
 * Description: Obtains symbol, lines, and columns. Prints out rectangular art with the symbol
 * 
 */

import java.util.Scanner;

public class q3 {
    // This main method is to initialize scanner and run the method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a symbol:  ");
        String symbol = s.next();

        System.out.printf("How many lines would you like to draw %s ?  ", symbol);
        int lines = s.nextInt();

        System.out.printf("How many %s would you like to draw in the column?  ", symbol);
        int columns = s.nextInt();

        drawArt(symbol, lines, columns);
        s.close();
    }

    // Outputs lxc rectangular art of symbol s.
    public static void drawArt(String s, int l, int c) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

}