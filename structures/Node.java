/**
 * Classe que representa um nó em uma estrutura de dados.
 *
 * @param <T> o tipo de elemento armazenado no nó
 */
public class Node<T> {

    /**
     * Referência para o próximo nó na estrutura de dados.
     */
    private Node<T> next;

    /**
     * Elemento armazenado no nó.
     */
    private T element;

    /**
     * Construtor que inicializa o nó com um elemento.
     *
     * @param element o elemento a ser armazenado no nó
     */
    public Node(T element) {
        this.next = null;
        this.element = element;
    }

    /**
     * Define o próximo nó na estrutura de dados.
     *
     * @param next o próximo nó
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Retorna o próximo nó na estrutura de dados.
     *
     * @return o próximo nó
     */
    public Node<T> getNext() {
        return this.next;
    }

    /**
     * Define o elemento armazenado no nó.
     *
     * @param element o elemento a ser armazenado
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Retorna o elemento armazenado no nó.
     *
     * @return o elemento armazenado
     */
    public T getElement() {
        return this.element;
    }
}