/**
 * A classe DinamicQueue representa uma fila dinâmica genérica.
 * 
 * @param <T> o tipo de elementos mantidos nesta fila
 */

public class DinamicQueue<T> {
    private Node<T> start;
    private Node<T> end;

    public DinamicQueue() {
        this.start = null;
        this.end = null;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (this.end == null) {
            this.start = newNode;
            this.end = newNode;
            return;
        } 
        
        this.end.setNext(newNode);
        this.end = newNode;
    }

    public void pop() {
        if (this.start == null) {
            System.out.println("Nothing to see here");
            return;
        }
            
        this.start = this.start.getNext();

        if (this.start == null) {
            this.end = null;
        }
    }

    public void showValues() {
        Node<T> aux = this.start;

        while (aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
}