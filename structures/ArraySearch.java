public class ArraySearch {
    private int values[] = {1, 2, 3, 5, 8, 13, 21};

    public int sequentialSearch(int element) {
        int i;

        for(i = 0; i < this.values.length; i++) {

            if(this.values[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int element) {
        int startIndex = 0;
        int midIndex = 0;
        int endIndex = this.values.length - 1;

        while(startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;

            if(this.values[midIndex] == element) {
                return midIndex;
            }

            if(this.values[midIndex] > element) {
                endIndex = midIndex - 1;
            }

            if(this.values[midIndex] < element) {
                startIndex = midIndex + 1;
            }
        }

        return -1;
    }
}
