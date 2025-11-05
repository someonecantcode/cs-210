
class Human {
    int age;
    String name;

    Human() {
        age 
    }

}

class Parent extends Human {
    String child;

    Parent() {
        super();
        child = "bill nye";
    }

    @Override
    public boolean equals(Object o){
        if (o == null) {
            throw new NullPointerException();
        }
        Parent other = (Parent) o;
        

        return false;
    }
}



public class notes {
    public static void main(String[] args){
        Human h = new Parent();
    }
}