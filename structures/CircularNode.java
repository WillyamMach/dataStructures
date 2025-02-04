public class CircularNode<T> {
    private T element;
    private CircularNode<T> next;
    private CircularNode<T> previous;

    public CircularNode(T element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public T getElement() {
        return this.element;
    }

    public void setNext(CircularNode<T> next) {
        this.next = next;
    }

    public CircularNode<T> getNext() {
        return this.next;
    }   

    public void setPrevious(CircularNode<T> previous) {
        this.previous = previous;
    }

    public CircularNode<T> getPrevious() {
        return this.previous;
    }
} 