
import java.util.Arrays;
import java.util.HashSet;

class superperson {

    public void output() {
        System.out.println("I am super");
    }
}

class person extends superperson {

    @Override
    public void output() {
        System.out.println("I am regular old joe");
    }
}

public class practice {

    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> hs2 = hs1; // reference (shallow copy)

        HashSet<Integer> hs3 = new HashSet<>(hs1);
        mutateTest(hs1, 123412);

        System.out.println(hs2);
        System.out.println(hs3);

        // HashSet<person> hs3 = new HashSet<superperson>(); // not possible lol HashSet<person> & HashSet<superperson> are now entire types
        // HashSet<? extends superperson> hs4 = new HashSet<person>(); // read only
    }

    public static <T> void mutateTest(HashSet<T> hs, T input) {
        hs.add(input);
    }
}
