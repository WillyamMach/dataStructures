/**
 * A classe DinamicStack representa uma pilha dinâmica genérica.
 *
 * @param <T> o tipo de elementos armazenados na pilha
 */

public class DinamicStack<T> {
    private Node<T> head;

    public DinamicStack() {
        this.head = null;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void pop() {
        this.head = this.head.getNext();
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public void listAllValues() {
        if(isEmpty()) {
            System.out.println("Nothing to see here!");
            return;
        }

        Node<T> aux = this.head; 
        while(aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
}