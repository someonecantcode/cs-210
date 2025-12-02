public class brodie {
    public static void main(String[] args) {
        LinkedListTEST<Integer> in = new LinkedListTEST<>();
        in.add(2);
        in.add(7);
        in.add(5);
        in.add(9); 
        in.add(12);
        in.add(10);
        System.out.println(findMid(in));
    }

    public static int findMid(LinkedListTEST<Integer> input) {

            Node<Integer> current = input.getFirst();

            while (current.next != null) {

            current = current.next;

            input.removeFirst();
            
            if (current.next != null){
                input.removeLast();
            }

            

            }

            return current.data;

            }
    
}
