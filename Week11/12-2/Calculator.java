public class Calculator {
    public static double[] b= new double[10];
     public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public static void main(String[] args){
        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}