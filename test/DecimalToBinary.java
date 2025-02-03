public class DecimalToBinary {
    private static final DinamicStack<Integer> list = new DinamicStack<>();

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Não foram passados parametros");
            return;
        }

        int userEntry = Integer.parseInt(args[0]);
        convertToBinary(userEntry);
        showBinaryList();
    }

    public static void convertToBinary(int userEntry) {
        while(userEntry != 0) {
            int binaryValue = userEntry % 2;
            userEntry = userEntry / 2;
            list.push(binaryValue);
        }
    }

    public static void showBinaryList() {
        list.listAllValues();
    }
}
