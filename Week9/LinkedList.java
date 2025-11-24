// wee need index to access the memory (bytes) | A[index] = 100 + (index*8);
// why index starts at 0? then it is not as simple as just simple as index*8. its (index -1)
// you don't want to have -1 constantly being calculated.

public class LinkedList<T> {
    // head and next
    Node<T> head;

    public LinkedList() {
        head = new Node<T>();
    }

    public LinkedList(T data) {
        head = new Node<T>(data);
    }

    public void add(T data) {
        // need check if its empty first
        if (head.data == null) {
            head.data = data;
            return;
        }

        // keep going next until empty and add
        while (head.next != null) {
            head = head.next;
        }

        head.next = new Node<T>();
        head.next.data = data;
    }

    @Override
    public String toString() {
        String output = "[";
        output += head.data;

        while (head.next != null) {
            head = head.next;
            output +=  ", " + head.data ;
        }
        output += "]";
        return output;

    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node() {
            this.data = null;
            this.next = null;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
