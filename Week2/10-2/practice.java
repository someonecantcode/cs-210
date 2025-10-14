
public class practice {public static void main(String[] args) {
        Double pi = 3.14159256358979323846264;
        leftAlign7char(pi);
        rightAlign12char(pi);
    }
    
    public static void leftAlign7char(Double input) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%7." + i + "f %n", input);
        }
    }

    public static void rightAlign12char(Double input) {
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%-12." + i + "f %n", input);
        }
    }
}
