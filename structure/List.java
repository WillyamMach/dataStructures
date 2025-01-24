public class List<T> {
    private Node<T> node;

    public List() {
        this.node = null;
    }

    public void append(T element) {
        Node<T> newNode = new Node<>(element);

        if (this.node == null) {
            this.node = newNode;
            return;
        }

        Node<T> aux = this.node;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }

        aux.setNext(newNode);
    }

    public T pop() {
        if (this.node == null) {
            System.out.println("List is empty");
        }

        T element = this.node.getElement();
        this.node = this.node.getNext();
        return element;
    }

    public boolean isEmpty() {
        return this.node == null;
    }

    public void listAllNodes() {
        if (this.node == null) {
            System.out.println("Nothing to show here");
            return;
        }

        Node<T> aux = this.node;
        while (aux != null) {
            System.out.println("El => " + aux.getElement());
            aux = aux.getNext();
        }
    }
}