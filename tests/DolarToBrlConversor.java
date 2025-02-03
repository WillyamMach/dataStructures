/**
 * Converte um valor em Dólar para Real Brasileiro (BRL).
 *
 * @param userEntry O valor em Dólar que o usuário deseja converter.
 * @param dolarValue A taxa de câmbio atual do Dólar para o Real Brasileiro.
 * @return O valor convertido em Real Brasileiro (BRL), arredondado para duas casas decimais.
 *
 * <p>Este método multiplica o valor de entrada do usuário pela taxa de câmbio do Dólar,
 * e então divide por 100 para garantir que o resultado seja arredondado para duas casas decimais.
 * Isso é feito para evitar problemas de precisão com números de ponto flutuante.</p>
 *
 * Por exemplo, se a taxa de câmbio do Dólar para o Real Brasileiro for 5,89 e o usuário
 * deseja converter 21 Dólares, o cálculo será: (21 * (5.89 * 100)) / 100, resultando em 123.69 BRL.
 */

public class DolarToBrlConversor {
    private static double dolarValue = 5.89;

    public static void main(String[] args) {
        DinamicStack<Double> list = new DinamicStack<>();

        list.push(calcBrlValue(21, dolarValue));
        list.push(calcBrlValue(14, dolarValue));
        list.push(calcBrlValue(16, dolarValue));

        list.listAllValues();
    }

    private static double calcBrlValue(double userEntry, double dolarValue) {
        // calculo para evitar erro de multiplicação com valores de ponto flutuante https://0.30000000000000004.com/
        return (userEntry * (dolarValue * 100)) / 100;
    }
}
