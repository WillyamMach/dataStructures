/**
 * A classe DecimalToBinary converte um número decimal para sua representação binária.
 * Utiliza uma pilha dinâmica para armazenar os valores binários.
 * 
 * Métodos:
 * - main(String[] args): Método principal que recebe um número decimal como argumento,
 *   realiza a conversão para binário e imprime a representação binária.
 * - convertToBinary(int userEntry): Converte o número decimal fornecido para binário
 *   e armazena os valores binários na pilha.
 * - printBinaryRepresentation(): Imprime a representação binária armazenada na pilha.
 * 
 * Exemplo de uso:
 * java DecimalToBinary 10
 * Saída: 1010
 */

public class DecimalToBinary {
    private static final DinamicStack<Integer> list = new DinamicStack<>();

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Não foram passados parametros");
            return;
        }

        int userEntry = Integer.parseInt(args[0]);
        convertToBinary(userEntry);
        printBinaryRepresentation();
    }

    public static void convertToBinary(int userEntry) {
        while(userEntry != 0) {
            int binaryValue = userEntry % 2;
            userEntry = userEntry / 2;
            list.push(binaryValue);
        }
    }

    public static void printBinaryRepresentation() {
        list.listAllValues();
    }
}
