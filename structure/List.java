public class List {
    private Node node;

    public List() {
        this.node = null;
    }

    public void append(int element) {
        Node<Integer> newNode = new Node<>(element);

        if (this.node == null) {
            this.node = newNode;
            return;
        }
        
        Node<Integer> aux = this.node;

        while (aux.getNext() != null) { 
            aux = aux.getNext();
        }

        aux.setNext(newNode);
    }
    
    public void pop() {
        Node aux = this.node;
        Node element = aux.getElement();
        inicio = aux.getNext();
        return element;
    }
    
    public void listAllNodes() {
        if(node == null) {
            System.out.println("Nothing to show here");
            return;
        }
        
        Node aux = this.node;
        while(aux != null) {
            System.out.println("El => " + aux.getElement());
            aux = aux.getNext();
        }
    }
}
