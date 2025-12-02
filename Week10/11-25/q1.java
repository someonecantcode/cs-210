class shape {
    double area;
    shape(double width, double height) {
        area = width * height / 2.0;
    }
}


public class q1 {
    public static void main(String[] args) {
        double[] a =new double[2];
        double[] b =new double[2];

        for(int i = 0; i<2; i++){
            shape s1 = new shape(i, i + 1);
            shape s2 = new shape(i, i+s1.area);
            a[i] = s1.area + s2.area;
        }

        b=a;
        b[0] = 3;

        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
            System.out.println(b[i]);
        }
    }
}