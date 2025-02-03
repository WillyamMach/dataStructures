public class ListTest {
    public static void main(String args[]) {
        List<Integer> list = new List<>();
        list.append(12);
        list.append(55);
        list.append(2);
        list.append(1);
        
        list.pop();
        list.pop();
        
        list.listAllValues();
    }
}