/*
 * Name: Brendan Tea
 * ID: 203238710
 * Date: November 10th, 2025
 * Description: 
 * 
 */

import java.util.*;

public class setOperation {

    static HashSet<String> CS210 = new HashSet<String>();
    static HashSet<String> CS211 = new HashSet<String>();
    static HashSet<String> CS212 = new HashSet<String>();

    public static void Initialize() {

        CS210.add("Bill");
        CS210.add("Eva");
        CS210.add("Jess");
        CS210.add("Olivia");
        CS211.add("Eva");
        CS211.add("Olivia");
        CS211.add("Jimi");
        CS212.add("Chloe");
        CS212.add("Jane");
        CS212.add("Olivia");
        CS212.add("Bill");
    }

    public static void atLeastOneClass() {
        System.out.println(Union(CS210, CS211, CS212));
    }

    public static void allClasses() {
        // A cap B. B cap C. A cap C.
        System.out.println(Intersect(Intersect(CS210, CS211), Intersect(CS211, CS212)));
    }

    public static void onlyCS210() {
        System.out.println(Intersect(Difference(CS210, CS212), Difference(CS210, CS211)));
    }

    public static void CS211Violation() {
        System.out.println(Difference(CS211, CS210));
    }

    public static void CS210andCS211notCS212Classes() {
        System.out.println(Difference(Intersect(CS210, CS211), CS212));
    }

    public static <T> HashSet<T> createAnCopy(HashSet<T> input) {
        return new HashSet<>(input);
    }

    public static <T> HashSet<T> Union(HashSet<T>... hs) {
        HashSet<T> out = createAnCopy(hs[1]);

        for (HashSet<T> element : hs) {
            out.addAll(element);
        }
        return out;
    }

    public static <T> HashSet<T> Intersect(HashSet<T> a, HashSet<T> b) {
        HashSet<T> out = createAnCopy(a);
        out.retainAll(b);
        return out;
    }

    public static <EFG, ANOTHERTYPE, ANOTHERONE> HashSet<EFG> Difference(HashSet<EFG> a, HashSet<EFG> b) {
        HashSet<EFG> out = createAnCopy(a);
        out.removeAll(b);
        return out;
    }

    public static void main(String[] args) {
        Initialize();
        // atLeastOneClass();
        // allClasses();
        // onlyCS210();
        // CS211Violation();
        // CS210andCS211notCS212Classes();
        CS210.addAll(CS211);     
        System.out.print(CS210);
    }
}
