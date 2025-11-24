import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class person {
    String name;
    int MathScore;
    int PhysicsScore;

    public person(String nameinput, int mathinput, int physicinput) {
        this.name = nameinput;
        this.MathScore = mathinput;
        this.PhysicsScore = physicinput;
    }
    @Override
    public String toString() {
        return String.format(
            "Name: %s %nMathScore: %d %nPhysicsScore: %d %n",
            this.name,
            this.MathScore,
            this.PhysicsScore
        );
    }

}

public class testing {

    public static void main(String[] args) throws FileNotFoundException {
       ArrayList < Integer > al = new ArrayList < Integer > ();
        HashSet < Integer > hs = new HashSet < Integer > ();
        HashMap < Integer, Integer > hm = new HashMap< Integer, Integer > ();
        for (int i = 0; i < 2; i++) {
            al.add(i++);
            hs.add(i);
            hm.put(i--, al.get(i));
        }
        System.out.println(al);
        System.out.println(hs);
        System.out.println(hm);

    }
    public static void printing(int v, int anotherone) {
        System.out.print(v);
        System.out.println(anotherone);
    }
}
