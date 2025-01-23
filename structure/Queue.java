import java.util.Arrays;

public class Queue<T> {
    private T[] values; 
    private int start;
    private int end;
    private int total;

    @SuppressWarnings("unchecked")
    public Queue(int end) {
        this.values = (T[]) new Object[end];
        this.end = end;
        this.start = -1;
        this.total = -1;
    }

    public void add(T element) {
        this.total++;
        this.values[total] = element;
    }

    public T remove() {
        start++;
        T removedValue = this.values[start];
        this.values[start] = null;

        return removedValue;
    }

    public boolean isFull() {
        return (total == end - 1);
    }

    public boolean isEmpty() {
        return (total == start);
    }
    
    public void showValues() {
        System.out.println(Arrays.toString(values));
    }

}