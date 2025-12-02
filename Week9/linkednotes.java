
public class linkednotes {
    public static void main(String[] args) {
        LinkedListTEST<Integer> a = new LinkedListTEST<Integer>();
        a.add(1);
        a.add(2);
        System.out.println(a.head.next.data);
        System.out.println(a);
    }
}