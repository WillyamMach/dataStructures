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
        return (userEntry * (dolarValue * 100)) / 100;
    }
}
