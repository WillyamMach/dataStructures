public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        int i = 0;
        
        while(!stack.isFull()) {
            stack.push(i);
            i++;
        }
        
        stack.showValues();
        
        while(!stack.isEmpty()) {
            stack.pop();
        }
        
        stack.showValues();
    }
}
