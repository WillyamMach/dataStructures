import java.util.Arrays;

public class Queue {
    private int[] values;
    private int start;
    private int end;
    private int total;

    public static void main(String args[]) {    
        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.showDataStructure();
    }

    public Queue() {
        values = new int[10];
        start = 0;
        end = 0;
        total = 0;
    }

    public void add(int el) {
        values[end] = el;
        end++;

        if(end == 10) {
            end = 0;
        }

        total++;
    }

    public void showDataStructure() {
        System.err.println(Arrays.toString(values));
    }

    public int remove() {
        int el = values[start];
        start++;

        if(start == 10) {
            start = 0;
        }

        total--;
        return el;
    }

    public boolean isFull() { 
        return (total == 10);
    }

    public boolean isEmpty() {
        return (total == 0);
    }
}
