
public class linkednotes {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        System.out.println(a.head.next.data);
        System.out.println(a);
    }
}