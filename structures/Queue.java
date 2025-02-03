import java.util.Arrays;

/**
 * Uma implementação genérica de Fila.
 *
 * @param <T> o tipo de elementos mantidos nesta fila
 */
public class Queue<T> {
    private T[] queue;
    private int start;
    private int end;
    private int size;

    /**
     * Constrói uma nova Fila com a capacidade especificada.
     *
     * @param end a capacidade da fila
     */
    @SuppressWarnings("unchecked")
    public Queue(int end) {
        this.queue = (T[]) new Object[end];
        this.start = 0;
        this.end = 0;
        this.size = 0;
    }

    /**
     * Adiciona um elemento ao final da fila.
     *
     * @param element o elemento a ser adicionado à fila
     * @throws ArrayIndexOutOfBoundsException se a fila estiver cheia
     */
    public void add(T element) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("A fila está cheia.");
        }
        queue[end] = element;
        end = (end + 1) % queue.length;
        size++;
    }

    /**
     * Remove e retorna o elemento na frente da fila.
     *
     * @return o elemento na frente da fila
     * @throws ArrayIndexOutOfBoundsException se a fila estiver vazia
     */
    public T remove() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("A fila está vazia.");
        }
        T element = queue[start];
        queue[start] = null;
        start = (start + 1) % queue.length;
        size--;
        return element;
    }

    /**
     * Verifica se a fila está cheia.
     *
     * @return {@code true} se a fila estiver cheia, {@code false} caso contrário
     */
    public boolean isFull() {
        return size == queue.length;
    }

    /**
     * Verifica se a fila está vazia.
     *
     * @return {@code true} se a fila estiver vazia, {@code false} caso contrário
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Exibe os elementos atuais na fila.
     */
    public void showValues() {
        System.out.println(Arrays.toString(queue));
    }
}