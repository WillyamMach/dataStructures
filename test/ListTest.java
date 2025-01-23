public class ListTest {
    public static void main(String args[]) {
        List list = new List();
        list.append(12);
        list.append(55);
        list.append(2);
        list.append(1);
        
        while(!list.isEmpty()) {
            int el = list.pop();
            System.out.println("Element removed: " + el);
        }
        
        list.listAllNodes();
    }
}