public class ArraySearchTest {
    public static void main(String[] args) {
        ArraySearch search = new ArraySearch();
        
        int sequential = search.sequentialSearch(1);
        int binary = search.binarySearch(1);
        
        System.out.println("sequential => " + sequential);
        System.out.println("binary => " + binary);
    }
}
