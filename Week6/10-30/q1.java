/*
 * Name: Brendan Tea
 * Date: October 3rd, 2025
 * Description: Prints out left and right aligned float
 * 
 */
class Super {
    int num = 1;
    int id = 2;
}

class Sub extends Super {
    int num = 3;

    public void display() {
        System.out.println(num);
        System.out.println();
        System.out.println(id);
    }
}

public class q1 {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.display();
    }
}