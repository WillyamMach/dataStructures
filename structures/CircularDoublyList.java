public class CircularDoublyList<T> {
    private CircularNode<T> head;

    public CircularDoublyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insert(T element) {
        CircularNode<T> newNode = new CircularNode<>(element);

        if(isEmpty()) {
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            this.head = newNode;
            return;
        }

        CircularNode<T> aux = this.head;

        while(aux.getNext() != this.head) {
            aux = aux.getNext();
        }

        aux.setNext(newNode);
        newNode.setPrevious(aux);
        newNode.setNext(this.head);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        if (this.head.getNext() == this.head) {
            this.head = null;
            return;
        }

        CircularNode<T> aux = this.head;

        while (aux.getNext() != this.head) {
            aux = aux.getNext();
        }

        aux.setNext(this.head.getNext());
        this.head.getNext().setPrevious(aux);
        this.head = this.head.getNext();
    }

    public void displayInOrder() {
        if(isEmpty()) {
            System.out.println("Nothing to see here!");
            return;
        }

        CircularNode<T> aux = this.head;

        do {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        } while(aux != this.head);
    }

    public void displayInReverseOrder() {
        if(isEmpty()) {
            System.out.println("Nothing to see here!");
            return;
        }

        CircularNode<T> aux = this.head;

        do {
            System.out.println(aux.getElement());
            aux = aux.getPrevious();
        } while(aux != this.head);
    }
}
