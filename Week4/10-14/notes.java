// How many arrays in code? 
// Answer: 1
// You are passing the reference, not a copy. That means the method that is passed with an
// array can edit the variable.

public class notes {
    public static void main(String[] args) {
        int[] iq = {126, 123, 150};
        increase(iq);

        for(int value : iq) {
            System.out.println(value);
        }
    }

    public static void increase(int[] a) {
        for(int i =0; i<a.length; i++){
            a[i] *= 2;
        }
    }

}