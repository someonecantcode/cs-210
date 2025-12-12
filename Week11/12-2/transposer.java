
public class transposer {
    static int[][] a = new int[10][10];
    static int[][] b = new int[10][10];

    public static void alg1() {
        double timestart = System.nanoTime();

        int[][] out = new int[10][10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                out[i][j] = a[j][i];
            }
        }

        System.out.printf("%nTime Elapsed: %f", System.nanoTime() - timestart);
    }

    public static void alg2() {
        double timestart = System.nanoTime();
        int[][] out = new int[10][10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                if (i == j) {
                    continue;
                }
                out[i][j] = b[j][i];
            }
        }

        System.out.printf("%nTime Elapsed: %f", System.nanoTime() - timestart);
    }

    public static void main(String[] args) {
        alg1();
        alg2();

        for (int[] n1 : a) {
            for (int n2 : n1) {
                System.out.println(n2);
            }
        }

        for (int[] n1 : b) {
            for (int n2 : n1) {
                System.out.println(n2);
            }
        }
    }
}