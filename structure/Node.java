public class Node<T> {
    private T element;
    private Node<T> next;
    
    public Node(T element) {
        this.element = element;
        this.next = null;
    }
    
    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    @SuppressWarnings("unchecked")
    public Node<T> getNext() {
        return this.next;
    }
}
