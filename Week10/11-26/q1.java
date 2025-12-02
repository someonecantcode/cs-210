

class A {
    int i = 1;
}

class B extends A  {
   int j = 2;
}
 

class C extends B  {
   int j = 3;
}

public class q1 {
    public static void main(String[] args){
        C bc = new C();
        System.out.println(bc.j);
        System.out.println(((B) bc).j);
    }
}