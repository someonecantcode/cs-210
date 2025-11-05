class Animal {
    public void sound() {
        System.out.println("wwwww");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("nya meow");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("who let the dogs out");
    }
}

public class notes {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for(Animal a : animals) {
            a.sound();
        }
    }
}