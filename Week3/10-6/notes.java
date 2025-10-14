import java.util.Random;
import java.lang.Thread;

public class notes {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int randomNumber;

        int range = 10; // r.nextInt(max) is (0, 9) inclusive (makes more sense to do range = 10 + 1)
        int min = 1;
        int notes = r.nextInt(range) + min; //range = (max - min + 1)


        while (true) {
            randomNumber = r.nextInt(10); // (0 - 9) inclusive
            System.out.println(randomNumber + " " + isOdd(randomNumber));
            Thread.sleep(1000);
        }

    }

    public static String isOdd(int n) {
        return (n & 1) == 1 ? "Odd" : "Even";
    }
}
