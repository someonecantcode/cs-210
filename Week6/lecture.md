# Classes & Objects

 Why do we create an instance/object from a class?
> Don't want to set properties of the entire class. (exception with static)

# Summary

* Method names includes the entire name and parameters.
* Class variables are static variables. Good for updating system wide variables such as exchange rates.
* Instance variables are non static variables.
* Constructer is used for initializing object with data.

```java
public class TriArea {
    // non-static & static variables
    static double width; 
    double height;

    // constructor & this keyword
    // parameters names should be understandable.
    TriArea(double width, double height) {
        TriArea.width = width; // for static, do  this.width = width; 
        this.height = height;
    }

    public double area() {
        return this.width * this.height / 2.0;
    }

    public double area(double width, double height){
        return width * height / 2.0;
    }
}


TriArea a = new TriArea(1,2);
```

# Exam

## Static versus nonstatic

* Class variables are static variables. Good for updating system wide variables such as exchange rates.
* Instance variables are non static variables.

```java
public class TriArea{
    public static double width = 57; // class wide variable
    public double height; // object only variable

    public double area(){
        double result = width / 2.0;
        return result;
    }
}

```

> Find k.width value and t.width value?

```java
public class classEx1 {
    public static void main(String[] args){
        TriArea t = new TriArea();
        TriArea k = new TriArea();
       
        t.height = 5; //affects t object height
        t.width = 2;  // t.width affects the entire class since width is static
        System.out.print(t.area()); //5.0 * 2.0
        k.height = 2;
        System.out.print(t.area()); // 2.0 * 2.0

        k.width = 10;
        System.out.print(t.width); // 10.0
        System.out.print(k.width); // 10.0

    } 
}

```

Changing value of static variable in a class

```java
TriArea t = new TriArea();
t.height = 5; //affects t object height
t.width = 2;  // t.width affects the entire class since width is static

TriArea.width = 2.0; // do instead of t.width for static vars
```

## When to use static?

```java
public class ExchangeRate {
    public static double peso = 10.0;
}

ExchangeRate hotel = new ExchangeRate();
System.out.println(hotel.peso);
```

# Constructor

* Used for initializing object with data.
* `this` keyword for readability. `this` refers to the class & object variables.

```java
public class TriArea {
    // non-static & static variables
    static double width; 
    double height;

    // constructor & this keyword
    // parameters names should be understandable.
    TriArea(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height / 2.0;
    }
}
```

# Method Overloading

* Multiple method signatures for the same method

```java
public class DisplayOverloading {
    //method name includes the entire parameter as well
    //method name is disp(char c)
    public void disp(char c) {
        System.out.println(c);
    }

    //method name is disp(char c, int num)
    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}


public class Sample {
    public static void main(String[]){
        DisplayOverLoading obj = new DisplayOverLoading();
        obj.disp('a');
        obj.disp('a', 123);
    }
}
```

# Encapsulation

* Two main big issues: external and internal (edgecases) attacks.

* Private and create setters and getters (security issues).

* Encapsulation forces abstraction.
  * Hiding implementation details from clients.
  * separates external view (behavior) from internal view (state)
  * protects the integrity of an object's data

## Benefits: abstraction between objects and clients

* Protects object from unwanted access
* Can constrain objects' state (invariants)

```java
public class MyDate {
    // public keyword 
    private int month;
    private int day;

    // can make filter in setters.
    public void setMonth(int n){
        this.month = m;
    }

    public void setDay(int d){
        this.day = d;
    }

    public int getDay(){
        // return this.day;
        return day;
    }

    public int getMonth(){
        // return this.month;
        return month;
    }

}

public class PrivateTest {
    public static void main(String[]) {
        MyDate md  = new MyDate();
        /*
        * cant do it with public
        * md.month = 2; 
        * md.day = 31; 
        */
        md.setMonth(2);
        md.setDay(12);

        System.out.println(md.getDay());
    }
}
```
