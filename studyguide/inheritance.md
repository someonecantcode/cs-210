# Inheritance & Interfaces

Two ways to use someone else's program

* use their method
* inherit and override or add.

### Superclass

* A larger class with super variables and methods.

### Subclass

* The child class that extends the super class and inherits its behavior
* Subclass gets a copy of every field and method from superclass

## Inheritance

```java
public class NewRandom extends Random {
    /*
    *  method overriding random.nextInt(int a); 
    *  same ammount parameters and same name
    */
    @Override
    public int nextInt(int a, ){
        return a;
    }

    // my own method
    public String randomPhrase() {
        return "mm cheeseburger";
    }
}
```

## Super keyword

```java
class Person{
    String name;
    int age;
    char gender;

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Teacher extends Person {
    String Subject;
    String Department;

    
    Teacher(String name, int age, char gender, String Subject, String Department) {
        super(name, age, gender);
        this.Subject = Subject;
        this.Department = Department;
    }
}

```

```java

class Parent {
    int num = 1;

}

class Child extends Parent {
    // int num = 1; invisible copy from super class???
    int num = 2;
    public void output() {
        System.out.println(num); // 2 Parent.Child.num
        System.out.println(super.num);  // 1 from COPY OF Parent.num  NOT FROM SUPER CLASS. NUM from child class copy of new variable   
    }
}

public class callInheritance {
    public static void main(String[] args) {
        Child = new Child();
        c.output();
    }
}
```

When creating objects like `Child c - new Child();`, you're also creating another copy of the class, completely disconnecting.
