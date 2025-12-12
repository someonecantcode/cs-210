# CS 210 FINAL REVIEW 

### 1. Intro
- Variables  
- [Methods](#methods)
- [For / While / Do-While Loops](#for-loops)
- [Scanners](#scanners)
- [Random](#random)  
- [File Reading and Writing](#file-inputoutput)
- Reference

### 2. Object-Oriented Programming (OOP)
- [Inheritance](#inheritance--interfaces) 
- [Static variables](#static-versus-nonstatic)
- [Method Overloading & Overriding](#method-overloading)
- [Constructors](#constructor)
- [Interfaces & Abstract Classes](#abstract-classes--methods)
- [Polymorphism](#polymorphism)

### 3. Data Structures
- [Arrays](#arrays-1)
- [ArrayList](#arraylist)
- [HashMap](#hashmaps)
- [HashSet](#hashset)
- [LinkedList](#linkedlist)



# Intro | CS 210 Midterm 1 Review

## Starting out

You are going to import and create a main class where you can run methods and statements.

```java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays; 
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class ClassName{
    //Static vars
    static int ROWS = 10;

    public static void main(String[] args) throws FileNotFoundException{
       double d = method(10);
    }

    public static double method(int n){
        return n;
    }

}
```
### Type Casting
```java
double result = (double) 19 / 5; // 3.8
int result2 = (int) result; // 3
int x = (int) Math.pow(10, 3); // 1000

String a="12.3";
double d = Double.valueOf(a); // String to double
System.out.println(d+1); // 13.3

String b="1";
int i = Integer.valueOf(b); // String to int
System.out.println(i+1); // 2

```

<div style="page-break-after: always;"></div>

### Methods
```java
// public or private
// static (accessible)
// return type
// MUST ALWAYS HAVE RETURN OUTPUT FOR ALL PATHS
public static int adder(int a, int b){
    return a+b;
}

```

### For Loops
```java
// Starts at 0 and ends at 5
// 0 1 2 3 4 5 (loops 6 times)
for(int i = 0; i<=5; i++) { 
    for(int j = 0; j<=5; j++) {
    }
}

// 0  1 2 3 4  (loops 5 times)
for(int i = 0; i<5; i++) { 
}

// 1 2 3 4 5  (loops 5 times)
for(int i = 1; i<=5; i++) { 
}
```

### While and Do While Loops
```java
// checks condition at the start
while (condition) {
   
}

// checks condition at the end
do {

} while (condition);

```

<div style="page-break-after: always;"></div>

### if statement
```java
//Ternary
(condition) ? true_statement : false_statement;

if(condition){

}
// !condition (not)
// condition1 && condition2
// condition2 || condition2

```

### Switch Case

```java
//no need for type in parameter
switch(input) {
    case "idk":
        return "hmm"
    case "do nothing":
        break;
    default:
        break;
}

```

## Specifics

### Strings
```java
// String var_name = "StringName";
String s = "Hello World"

s.charAt(0) // H
```

| Methods                | Return  |
| ---------------------- | ------- |
| `String.length()`      | `int`   |
| `String.equals(str)`      | `boolean` |
| `String.indexOf(str)`      | `int` |
| `String.substring(index1, index2)`      | `String` index2 defaults to `string.length()-1` |
| `String.toLowerCase()`      | `String` |
| `String.toUpperCase()`      | `String` |
| `String.charAt(Index)` | `char`    |
| `String.equalsIgnoreCase(str)`              |   `boolean`      |
| `String.startsWith(str)`              |   `boolean`      |
| `String.endsWith(str)`              |     `boolean`       |
| `String.contains(str)`              |     `boolean`       |



<div style="page-break-after: always;"></div>

### System.out.printf
```java
//default right align
System.out.printf(string, params);
System.out.printf("my teacher is %s", "taesik kim");
```

| Methods    | Return |
| ---------- | ------ |
|`%n`| Line Break |
|`%b`| `boolean` |
|`%c`| `char` |
|`%s`| `String` |
|`%d`| `int` |
|`%f`| `float` |
|`%%` | % symbol |
|`%-6.1f` | example left align 6 chars wide 1 decimal. |

### Chars
```java
// A - 65 / Z - 90
// a - 97 / z - 122 
char c1 = 'b';
char c2 = 'd';

int n = c1 + c2; // 98 + 100 = 198
boolean test = (c1 == c2); // false

for(char c ='a'; c<='f'; c++){
    System.out.println(c + " " + (1+c));
    // a 98
    // b 99
}
```
<div style="page-break-after: always;"></div>

### Random

```java
Random r = new Random();

r.nextInt(10); // (0 - 9) inclusive

public static int randomIntRange(int min, int max) {
    return new Random().nextInt(max - min + 1) + min; //range = (max - min + 1)
}
```

| Methods    | Return |
| ---------- | ------ |
| `r.nextInt(max)` | `int` [0, max) |
|`r.nextDouble()`| `double` [0.0, 1.0)|


### Scanners

```java
import java.util.Scanner;

//Scanner var = new Scanner(input type);
// input type: System.in, new File(), String s;
Scanner s = new Scanner(System.in);
int n = s.nextInt();

s.close();
```

| Methods    | Return |
| ---------- | ------ |
| `s.next()` |   `String`     |
| `s.nextLine()` |   `String`     |
| `s.nextInt()` |      `int`  |
| `s.nextDouble()` |      `double`  |
| `s.hasNext()` |     `boolean`   |
| `s.hasNextInt()` |     `boolean`   |
| `s.hasNextDouble()` |     `boolean` (can take int)  |

<div style="page-break-after: always;"></div>

### File Input/Output

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

// main method stuff
public static void main(String[] args) throws FileNotFoundException {
    // file location
    File fin = new File("member.txt");
    File fout = new File("output.txt");
    
    Scanner fileinput = new Scanner(fin);
    PrintStream out = new PrintStream(fout);

    String readinput = fileinput.nextLine();
    out.println(readinput);

    fileinput.close();
    out.close();
} 
```
| Methods        | Return    |
| -------------- | --------- |
| `PrintStream.close()` | `void`|
| `PrintStream.println(output)` | `void`|


<div style="page-break-after: always;"></div>

### Arrays

```java
// ArrayType[] var_name = new ArrayType[size];
// Static size

int[] numbers = new int[8];
String[] s1 = {"hi", "bye", "good night"};
String[] s2 = s1; 
// NOT copied. referenced so s1 and s2 are the same object array.

numbers[0] = 100;
numbers[7] = 90;

for(int n : numbers) {
 
}
```

| Methods        | Return    |
| -------------- | --------- |
| `array.length` | int       |
| `array[index]` | arrayType |

> Import java.util.Arrays

| Methods                             | Return               |
| ----------------------------------- | -------------------- |
| `Arrays.binarySearch(array,value)` |                      |
| `Arrays.copyOf(array, length)`     |                      |
| `Arrays.equals(array1, array2)`     | boolean (same order) |
| `Array.fill(array, value)`          | array                |
| `Arrays.sort(array)`                | array                |
| `Arrays.toString(array)`            | string               |

# OOP

## Classes & Objects

 Why do we create an instance/object from a class?
> Don't want to set properties of the entire class. (exception with static)

## Summary

* Method names includes the entire name and parameters.
* Class variables are static variables. Good for updating system wide variables such as exchange rates.
* Instance variables are non static variables.
* Constructer is used for initializing object with data.

```java
public class TriArea {
    // non-static & static field variables
    static double width; 
    double height;

    // constructor & this keyword
    // parameters names should be understandable.
    TriArea(double width, double height) {
        TriArea.width = width; // for static, for non-static, do this.width = width; 
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

For systems that need a system-wide variable that gets updated.

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

**IF YOU CREATE A CONSTRUCTOR, THERE WILL BE NO MORE DEFAULT BLANK CONSTRUCTOR. YOU MUST HAVE MULTIPLE CONSTRUCTORS FOR VARYING PARAMETERS** 

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

// YOU MUST CREATE AN OBJECT WITH PARAMETERS.
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

# Method Override

* Usually paired with the `@Override` annotation. Annotation makes compiler check if method signature is the same. Used for when inherited methods are need to be overrided. 


* Makes so you can have one method name and you don't have to look for individual method names for all class and subclasses.

* `@Override` annotation
The compiler will check if the overriden function matches any of the super classes method signatures. Helps to check if you made any mistakes.

**Must be same method signature.**

```java
public class parent {
    public void print(){
        System.out.println("hello");
    }
}

public class child extends parent {
    @Override
    public void print(){
        System.out.println("hello through child");
    }
}

```


```java
public class Child extends Parent {
    private static int bonus = 100;

    @Override
    public double getPay() {
        return (super.getPay() + bonus);
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


# Inheritance

Two ways to use someone else's program

* use their method
* inherit and override or add.

### Superclass

* A larger class with super variables and methods.

### Subclass

* The child class that extends the super class and inherits its behavior
* Subclass gets a copy of every field and method from superclass

**IMPORTANT: A SUBCLASS CONSTRUCTOR WILL AUTOMATICALLY RUN SUPER() CONSTRUCTOR.**

## Inheritance

Simply extend a class.

```java
public class NewRandom extends Random {
    /*
    *  method overriding random.nextInt(int a); 
    *  same ammount parameters and same name
    */
    @Override
    public int nextInt(int a){
        return a;
    }

    // my own method
    public String randomPhrase() {
        return "mm cheeseburger";
    }
}
```

## Super keyword

**IMPORTANT: A SUBCLASS CONSTRUCTOR WILL AUTOMATICALLY RUN SUPER() CONSTRUCTOR.**

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

# Abstract Classes & Methods

* AN abstract class is declared through `public abstract class class_name(<T> a);` and must have no body/implementation.

* same methods for all objects and developers can develop simultaneously.

* **must implement/override** all abstract methods when inherity.

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


# Interfaces

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

# Polymorphism

* Same code be used with different types of objects and behave differently with each. You can use the same code for different type of objects and each behaves differently.

## RUN TIME

* if you won the super class, you might need to do this to access the super class when it is extended.

* In the form `Parent a = new Child()`. **Will run the Parent() constructor first then the Child() constructor second.**

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
        student s = new student(); // compile time
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



# Recurvsive programs and recursion

* 211 content

# Data Structures

* ways of storing and controlling data.

## Arrays

```java
// ArrayType[] var_name = new ArrayType[size];
// Static size

int[] numbers = new int[8];
String[] s1 = {"hi", "bye", "good night"};
String[] s2 = s1; 
// NOT copied. referenced so s1 and s2 are the same object array.

numbers[0] = 100;
numbers[7] = 90;

for(int n : numbers) {
 
}
```

| Methods        | Return    |
| -------------- | --------- |
| `array.length` | int       |
| `array[index]` | arrayType |

> Import java.util.Arrays

| Methods                             | Return               |
| ----------------------------------- | -------------------- |
| `Arrays.binarySearch(array,value)`  |                      |
| `Arrays.copyOf(array, length)`      |                      |
| `Arrays.equals(array1, array2)`     | boolean (same order) |
| `Array.fill(array, value)`          | array                |
| `Arrays.sort(array)`                | array                |
| `Arrays.toString(array)`            | string               |

## ArrayList

* mistakes to check: removing index (it changes every statement) and removing object
* must confirm if you did remove with if statement.

```java
String UserID2Remove = "K";

if(AL.remove(UserID2Remove)) {
    System.out.printf("%s Removed", UserID2Remove);
} else {
    System.out.printf("%s not found", UserID2Remove);
}
```

```java
import java.util.ArrayList;

// u can have your own custom type
ArrayList<Integer> numbers = new ArrayList<>(1, 2, 3);
numbers.add(1);
numbers.add(2);
numbers.add(3);


numbers.remove(0); // removes index not value "0" ADDITIONALLY SHIFTS EVERYTHING TO THE LEFT CHANGING ALL VALUES INDEX
numbers.remove(1); // [2, 3] REMOVING INDEX 1 MAKES IT [2] 

System.out.println(numbers); // [2]
numbers.add(1);
numbers.size(); // 2 since we added another element
numbers.get(0); // index 0 is 1;
```

| Methods                             | Return               |
| ----------------------------------- | -------------------- |
| `myArrayList.add(value)`            |                      |
| `myArrayList.add(index, value)`     |    pushes everything in ahead forward           |
| `myArrayList.clear()`     | void |
| `myArrayList.indexOf(value)`          | int index            |
| `myArrayList.size()`                | int                |
| `myArrayList.sort()`            | void
| `myArrayList.remove(int index)`            | `E`            |
| `myArrayList.remove(Object o)`            | `boolean`removes first index that there is an object. does not remove duplicates|

## LinkedList

* Data structure that links from head to next node until the end.

* You cannot access the internal nodes with the `java.util.LinkedList`.

```java
import java.util.LinkedList

LinkedList<Integer> l = new LinkedList<>();

l.add(1);

```
# LinkedList (Java) — Main Methods & Operations

| Category | Method | Description |
|---------|--------|-------------|
| **Add Elements** | **`add(E e)`** | Adds element to end of list |
| | `add(int index, E e)` | Inserts element at specific index |
| | `addFirst(E e)` | Adds element at the front |
| | `addLast(E e)` | Adds element at the end |
| | `offer(E e)` | Adds element to end (queue-style) |
| | `offerFirst(E e)` | Adds element to front |
| | `offerLast(E e)` | Adds element to end |
| **Remove Elements** | `remove()` | Removes first element |
| | **`remove(int index)`** | Removes at index |
| | **`remove(Object o)`** | Removes first occurrence of value |
| | `removeFirst()` | Removes first element |
| | `removeLast()` | Removes last element |
| | `poll()` | Retrieves & removes first element, returns `null` if empty |
| | `pollFirst()` | Retrieves/removes first |
| | `pollLast()` | Retrieves/removes last |
| **Access Elements** | `get(int index)` | Returns element at index |
| | `getFirst()` | Returns first element |
| | `getLast()` | Returns last element |
| | `peek()` | Looks at first element without removing |
| | `peekFirst()` | Same as `peek()` |
| | `peekLast()` | Looks at last element |
| **Search** | `contains(Object o)` | Checks if the list contains value |
| | `indexOf(Object o)` | Returns first index of match |
| | `lastIndexOf(Object o)` | Returns last index of match |
| **Update** | `set(int index, E e)` | Replaces element at index |
| **Stack Operations** | `push(E e)` | Push to front (LIFO) |
| | `pop()` | Remove & return front (LIFO) |
| **Utilities** | **`size()`** | Number of elements |
| | `clear()` | Removes all elements |
| | `isEmpty()` | Checks if empty |


## HashSet

* Data structure set that does not allow duplication.
* There is no index and no specific order.
* It is a set and it hashs the data with a "hash function/table" that allows the computer to find the memory address (look up table) to the values.

* HASHSETS ARE REFERENCES OH NOES

```java
HashSet<String> hs = new HashSet<String>();

hs.add("bobby");
hs.add("google");
hs.add("samsung");

System.out.println(hs);

for(String s : hs){
    System.out.print(s);
}
```

| Methods        | Return    |
| -------------- | --------- |
| `hs.add(Object o)` | void       |
| `hs.contains(Object o)` | boolean |
| `hs.remove(Object o)` | boolean |
| `hs.size()` | int |

### Set Operations

** **

*OPERATIONS WILL MODIFY THE STATE*

Let $$ A = \{1,2,3\} \\ B = \{3,4,5\} $$

```java
HashSet<Integer> A = new HashSet<Integer>();
A.add(1);
A.add(2);
A.add(3);

HashSet<Integer> B = new HashSet<Integer>();
B.add(3);
B.add(4);
B.add(5);
```

Union of A & B $$ A \cup B = \{ 1,2,3,4,5\}$$

```java
A.addAll(B) // A new state
```

Intersection of A & B $$ A \cap B = \{ 3\}$$

```java
A.retainAll(B) // A new state
```

Difference of A - B (order matters) $$ A - B = \{1,2 \} $$

```java
A.removeAll(B) // A new state
```

$$ B - A = \{ 4,5 \} $$

```java
B.removeAll(A) // A new state
```

Symmetric Difference  $$A \Delta B = \{1,2,3,4\} $$

```java
HashSet<Type> middle = Intersect(A,B);
HashSet<Type> cloneA = new HashSet<Type>(A);

cloneA.addAll(B);

Symmetric Difference = (cloneA.removeAll(middle))

```

### Copy/Clone a set

```java
CS210.addAll(cs211); // don't do this. you'll modify the original one


// COPYING
Set<T> temp = new HashSet<>(CS210);
HashSet<String> temp = new HashSet<>(CS210);

HashSet<String> temp = new HashSet<>();
temp.addall(CS211);


// CLONING

Set<T> temp = (Set<T>CS210.clone());
temp = (HashSet) CS210.clone(); 
// downcast from Object to Hashset (advanced) leads to unchecked warning
// Hashset.clone() creates a SHALLOW COPY. REFERENCE

```

## Hashmaps

```java
import java.util.HashMap;

HashMap<keyType, valueType> hs = new HashMap<>();
hs.put(1, "my balls hurt");

System.out.print(hs);
/*
* {1=my balls hurt} // hashmap
* [my balls hurt] // arraylist
* [my balls hurt] // hashset
*
*/

System.out.print(hm.size()); // 1
System.out.print(hm.get(1)); // my balls hurt

```

| Methods        | Return    |
| -------------- | --------- |
| `hm.put(KeyType a, ValueType b)` | ValueType       |
| `hm.get(Object key)` | ValueType       |
| `hm.size()` | int       |
| `hm.containsKey(Object o)` | void |
| `hm.containsValue(Object o)` | void |
| `hm.clear()` | void |
| `hm.remove(Object o)` | ValueType |
| `hm.remove(Object key, Object value)` | boolean |
| `hm.keySet()` | Set<K> |
| `hm.values()` | Set<V> |

# Iterators

* Allows you to traverse through the java collections (ArrayList, LinkedList, HashSet, etc.)

```java
Iterator<String> it = list.iterator();

while (it.hasNext()) {
    it.next();
    size++;
}

```