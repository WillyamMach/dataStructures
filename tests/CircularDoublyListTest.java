public class CircularDoublyListTest {
    public static void main(String[] args) {
        CircularDoublyList<Integer> list = new CircularDoublyList<>();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        
        list.displayInOrder();
        list.displayInReverseOrder();
    }
}
