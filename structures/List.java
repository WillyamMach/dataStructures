public class List<T> {
    private Node<T> head;

    public List() {
        this.head = null;
    }
    
    public void append(T element) {
        Node<T> newNode = new Node<>(element);
        
        if(isEmpty()) {
            this.head = newNode;
            return;
        }
        
        Node<T> aux = this.head;
        
        while(aux.getNext() != null) {
            aux = aux.getNext();
        }
        
        aux.setNext(newNode);
    }
    
    public void pop() {
        this.head = this.head.getNext();
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }

    public void listAllValues() {
        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        Node<T> aux = this.head;
        while(aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
}