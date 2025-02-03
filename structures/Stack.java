import java.util.Arrays;

public class Stack<T> {
    private int top;
    private int size;
    private T[] values;

    @SuppressWarnings("unchecked")
    public Stack(int max) {
        this.values = (T[]) new Object[max];
        this.size = max;
        this.top = -1;
    }

    public void push(T el) {
        this.values[++top] = el;
    }

    public T pop() {
        T removedElement = this.values[top];
        this.values[top--] = null;
        return removedElement;
    }

    public boolean isFull() {
        return (this.top == this.size - 1);
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }
    
    public void listAllValues() {
        System.out.println(Arrays.toString(this.values));
    }
}