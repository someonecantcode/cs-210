public class math{
    public static void main(String[] args) {
            Average(3, 5.6);
    }

    static void Average(double n1, double n2){
        double sum = n1+n2;

        System.out.printf("Sum of %.0f and %2f = %f %n", n1, n2, sum);
        System.out.printf("Average of %f and %f = %f %n", n1, n2, sum/2);
    }
}

