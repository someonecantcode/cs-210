class Node<T> {
    T data;
    transient Node<T> next;

    @Override
    public String toString() {
        return this.data.toString();
    }
}