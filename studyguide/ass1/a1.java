
public class a1 {
    int a;
    private int b;
    static int c;

    a1(int a, int c){
        this.a = a;
        a1.c = c;
        System.out.println("hi");
    }

    a1(){
        System.out.println("NO");
    }

    public int does(){
        return 1;
    }
}