import java.util.Arrays;

/**
 * Classe que implementa uma pilha genérica.
 *
 * @param <T> Tipo dos elementos armazenados na pilha.
 */
public class Stack<T> {
    private int top;
    private int size;
    private T[] values;

    /**
     * Construtor que inicializa a pilha com um tamanho máximo.
     *
     * @param max Tamanho máximo da pilha.
     */
    @SuppressWarnings("unchecked")
    public Stack(int max) {
        this.values = (T[]) new Object[max];
        this.size = max;
        this.top = -1;
    }

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param el Elemento a ser adicionado.
     */
    public void push(T el) {
        this.values[++top] = el;
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return Elemento removido do topo da pilha.
     */
    public T pop() {
        T removedElement = this.values[top];
        this.values[top--] = null;
        return removedElement;
    }

    /**
     * Verifica se a pilha está cheia.
     *
     * @return true se a pilha estiver cheia, false caso contrário.
     */
    public boolean isFull() {
        return (this.top == this.size - 1);
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário.
     */
    public boolean isEmpty() {
        return (this.top == -1);
    }
    
    /**
     * Lista todos os valores da pilha.
     */
    public void listAllValues() {
        System.out.println(Arrays.toString(this.values));
    }
}