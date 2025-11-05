# polymorphism

* Same code be used with differen types of objects and behave differently with each. You can use the same code for different type of objects and each behaves differently.

## RUN TIME

* if you won the super class, you might need to do this to access the super class when it is extended.

```java
class person {
    int hours = 8;
}

class student extends person {
    int hours = 10;

    public void output() {
        System.out.print(this.hours);
    }
}

public class practice {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.hours); // 10
        s.output();

        person p = new person();
        System.out.println(p.hours); // 8 person.hours
        // p.output() does not work

        person ps = new student(); // does not use override.
        // person type ps is a student object and inherits only the overrided methods. 
        System.out.println(ps.hours); // 8 person.hours super.hours basically in student().
        // ps.output does not work
    }
}
```

## COMPILE TIME 

```java
class person {
    int hours = 8;
    public void work(){

    }
}

class student extends person {
    int hours = 10;

    @Override
    public void work() {
        System.out.print(this.hours);
    }
}

public class practice {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.hours); // 10
        s.output();

        person p = new person();
        System.out.println(p.hours); // 8 person.hours
        // p.output() does not work
    }
}

```

## inefficiencies

* no objects, redundant

* do you write program just for cat or dog? sometimes later, you may want to add your own sounds and extend it.
* you want to write system so that they can extend it for their own purpose. In mind for public.

```java
Scanner input = new Scanner(System.in);

String nose;
System.out.println("Touch your nose on the screen");
nose = input.next();

if (nose.equals("cat")) {
    System.out.println("meow");
}

if (nose.equals("dog")) {
    System.out.println("bark");
}
```

## overriding

* Makes so you can have one method name and you don't have to look for individual method names for all class and subclasses.

* `@Override` annotation
The compiler will check if the overriden function matches any of the super classes method signatures. Helps to check if you made any mistakes.

```java
public class Child extends Parent {
    private static int bonus = 100;

    @Override
    public double getPay() {
        return (super.getPay() + bonus);
    }
}

```

# Recurvsive programs and recursion

* 211 content
