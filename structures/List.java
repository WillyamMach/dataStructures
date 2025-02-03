/**
 * Classe que representa uma lista encadeada simples.
 *
 * @param <T> O tipo de elemento armazenado na lista.
 */

/**
 * Classe que representa uma lista encadeada genérica.
 *
 * @param <T> O tipo de elemento armazenado na lista.
 */
public class List<T> {

    /**
     * Nó cabeça da lista.
     */
    private Node<T> head;

    /**
     * Construtor da lista. Inicializa a lista como vazia.
     */
    public List() {
        this.head = null;
    }

    /**
     * Adiciona um elemento ao final da lista.
     *
     * @param element O elemento a ser adicionado.
     */
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
    
    /**
     * Remove o primeiro elemento da lista.
     */
    public void pop() {
        this.head = this.head.getNext();
    }
    
    /**
     * Verifica se a lista está vazia.
     *
     * @return true se a lista estiver vazia, false caso contrário.
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Lista todos os valores presentes na lista.
     * Se a lista estiver vazia, imprime "Lista vazia".
     */
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