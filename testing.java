import java.io.FileNotFoundException;
import java.util.Arrays;

class person {
    String name;
    int MathScore;
    int PhysicsScore;

    public person(String nameinput, int mathinput, int physicinput) {
        this.name = nameinput;
        this.MathScore = mathinput;
        this.PhysicsScore = physicinput;
    }
    
}

class Parent {
    public double getPay() { return 0; }
}

class Child extends Parent {
    private static int bonus = 100;

    @Override
    public double getPay() {
        return (super.getPay() + Child.bonus);
    }
}

public class testing {

    public static void main(String[] args) throws FileNotFoundException {
        double[] a = new double[5];
        a[1] = 6.5;
        a[4] = -4.5;

        double[] b = a;
        b[1] = 2;
        b[4] = 3;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // should i start ai from beginning
        // already can find so many similair programs in the world and import
    }

}

