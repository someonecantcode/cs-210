import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class t2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            al.add(i++);
            hs.add(i);
            hm.put(i--, al.get(i));
        }
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "your mother");

        System.out.println(al); // prints in [a, b]
        System.out.println(hm); // prints in {k1=v1, k2=v2}
        System.out.println(hs); // prints in [a, b]
    }

    public static double m(int a, double b) {
        return a + b;
    }

    public static double m(double a, double b) {
        return a - b;
    }

    public static double m(int a, int b) {
        return a % b;
    }
}