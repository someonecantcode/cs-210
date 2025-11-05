
class TriArea {
    public static double width;
    double height = 5;

    public double area() {
        double result = width * height / 2.0;
        return result;
    }
}

public class notes {
    public static void main(String[] args) {
        TriArea t = new TriArea();
        TriArea k = new TriArea();

        t.height = 5; // affects t object height
        t.width = 2; // t.width affects the entire class since width is static
        System.out.print(t.area()); // 5.0 * 2.0
        k.height = 2;
        System.out.print(t.area()); // 2.0 * 2.0

        k.width = 10;
        System.out.print(t.width); // 10.0
        System.out.print(k.width); // 10.0
    }
}