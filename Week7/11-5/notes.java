
interface myInterface1 {
    /*
     * all the methods are public a dstract by default
     * all the methods are not having body or implementation
     */
    public void method1();
}

interface myInterface2 {
    public void method2();
}

abstract class superclass {
    public abstract void urMom();
}

class childInheritor extends superclass implements myInterface1, myInterface2 {

    @Override
    public void method1() {
        System.out.println("I am method 1 from myInterface1");
    }

    @Override
    public void method2() {
        System.out.println("I am method 2 from myInterface2");
    }

    @Override
    public void urMom() {
        System.out.println("ur mom jokes");
    }
}

public class notes {
    public static void main(String[] args){
        childInheritor c = new childInheritor();

        c.urMom();
        c.method1();
        c.method2();
    }
}