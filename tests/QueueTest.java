public class QueueTest {
    public static void main(String Args[]) {
        Queue<Integer> queue = new Queue<>(10);
        int i = 0;
        
        while(!queue.isFull()) {
            i++;
            queue.add(i);
            queue.showValues();
        }
        
        while(!queue.isEmpty()) {
            queue.remove();
            queue.showValues();
        }
    }
}
