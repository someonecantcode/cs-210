
import java.util.HashSet;

public class practice {

    static String[] people = {"Bill", "Emma", "Olivia", "Kim", "Chloe", "Jane"};
    static HashSet<String> CS210 = new HashSet<>();
    static HashSet<String> CS211 = new HashSet<>();
    static HashSet<String> CS212 = new HashSet<>();

    public static void main(String[] args) {
        addSetfromArray(0, 2, people, CS210);
        addSetfromArray(1, 3, people, CS211);
        addSetfromArray(3, people.length - 1, people, CS212);
        CS211.add(people[2]);

        // (C ∩ B) - A
        System.out.println(Difference(Intersect(CS211, CS212), CS210));

        // (C-A) ∩ (C-B) = C - (A U B)
        System.out.println(Difference(CS212, Union(CS210, CS211)));
    }

    // indexes are inclusive inclusive
    public static <T> HashSet<T> addSetfromArray(int startIndex, int endIndex, T[] people, HashSet<T> hs) {
        if (endIndex > people.length - 1) {
            int lastIndex = people.length - 1;
            System.out.print("out of bounds. set to last index: " + lastIndex);
            endIndex = lastIndex;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            hs.add(people[i]);
        }

        return hs;
    }

    public static <T> HashSet<T> createAnCopy(HashSet<T> input) {
        return new HashSet<>(input);
    }

    public static <T> HashSet<T> Union(HashSet<T> a, HashSet<T> b) {
        HashSet<T> out = createAnCopy(a);
        out.addAll(b);
        return out;
    }

    // varargs ... with Collection super class
    // public static <T> HashSet<T> Union(Collection<T>... collections) {
    //     HashSet<T> result = new HashSet<>();  
    //     for (Collection<T> collection : collections) {
    //         result.addAll(collection);  
    //     }
    //     return result;  
    // }
    public static <T> HashSet<T> Intersect(HashSet<T> a, HashSet<T> b) {
        HashSet<T> out = createAnCopy(a);
        out.retainAll(b);
        return out;
    }

    public static <T> HashSet<T> Difference(HashSet<T> a, HashSet<T> b) {
        HashSet<T> out = createAnCopy(a);
        out.removeAll(b);
        return out;
    }

    public static <T> HashSet<T> SymmetricDifference(HashSet<T> a, HashSet<T> b, T c) {
        // D = (A intesect B)
        // (A - D) U (B - D) -> weird solution i thought of
        // (A - B) U (B - A) -> initial intuition
        // ( A U B ) - ( D ) -> best (least operations)

        // HashMap<T> intersect = Intersect(a,b);
        // return Union(Difference(a, intersect), Difference(b, intersect));

        // return Union(Difference(a,b), Difference(b,a));
        return Difference(Intersect(a, b), Union(a, b));

       
    }
}
