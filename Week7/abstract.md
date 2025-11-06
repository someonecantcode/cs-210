# Abstract

* AN abstract class is declared through `public abstract class class_name` and must have no body

* same methods for all objects and developers can develop simultaneously.

* must implement/override all abstract methods when inherity.

```java
public abstract class notes {
    public abstract void deeznuts();
    public abstract void deeznuts(int n);

    public void output() {
        System.out.println("we can have both abstract & non-abstract types ")
    }
}

class Mei extends notes {
    @Override
    public void deeznuts() {
        System.out.print("no");
    }

    @Override
    public void deeznuts(int n){
        // im busy but ill work on this but i'll leave some implementation so no error
    }
}
```


# interfaces

* abstract but on steroids.
* uses key word `implements` instead of `extend` to inherit.

* Can inherit multiple


```java
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

public abstract class super { 
    public abstract void urMom();
}

public class childInheritor extends super implements myInterface1, interface2 {
    @Override
    public void method1(){

    }

    @Override
    public void method2() {

    }

    @Override
    public void urMom() {
        
    }
}
```

