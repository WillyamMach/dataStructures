import java.util.Arrays;

class Stack {
    private int values[];
    private int top;
    
    public static void main(String args[]) {
        Stack stack = new Stack();     
        int i = 0;
        
        while(!stack.isFull()) {
            stack.push(i);
            i++;   
        }
        
        stack.pop();
        stack.pop();
        stack.showDataStructure();
    }
    
    public Stack() {
        values = new int[10];
        top = -1;
    }
    
    public void push(int el) {
        top += 1;
        values[top] = el;
    }
    
    public boolean isFull() {
        return (top == 9);
    }
    
    public int pop() { 
        int el = values[top];
        values[top] = 0;
        top--;
        return el;
    }
    
    public void showDataStructure() {
        System.out.println(Arrays.toString(values));
    }
}