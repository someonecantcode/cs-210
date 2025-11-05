

class Parent {
    int num = 1;
}

class Child extends Parent {
    int num = 2;
    // int super.num = 1;

    public void output() {
        System.out.println(this.num);
        System.out.println(super.num);
    }
}


public class notes {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.output();

        Parent p1 = new Parent();
        p1.num = 50;

        c1.output();

        Child c2 = new Child();

    }
}