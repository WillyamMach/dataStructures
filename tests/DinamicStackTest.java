public class DinamicStackTest {
    public static void main(String[] args) {
        DinamicStack<Integer> list = new DinamicStack<>();
        
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.pop();

        list.listAllValues();
    }
}
