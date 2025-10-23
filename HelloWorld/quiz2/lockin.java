/*
 * Name: Brendan Tea
 * Date: September 29, 2025
 * Description: Prints out a rectangular output of symbol
 * 
 */

public class lockin {
    // This main method is to initialize variables and run the method
    public static void main(String[] args) {
        String s = "#";
        int row = 5;
        int col = 4;

        DrawSymbols(s, row, col);
    }

    // This method is to draw symbols in a rectangular output
    public static void DrawSymbols(String s, int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
        
    }
}