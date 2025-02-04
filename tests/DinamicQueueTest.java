public class DinamicQueueTest {
    public static void main(String[] args) {
        DinamicQueue<Integer> queue = new DinamicQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.pop();
        queue.add(4);

        queue.showValues();
    }
}
