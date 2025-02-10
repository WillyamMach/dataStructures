public class SelectionSort {
    private int array[] = {20, 30, 10, 50, 40, 90, 70, 80, 60, 11, 33, 66, 23, 9};
    
    public void order() {
        int lowestPosition;
        int lowestPositionStart;

        for(int i = 0; i < array.length; i++) {
            lowestPositionStart = i;
            lowestPosition = i + 1;

            for(int j = lowestPositionStart + 1; j < array.length; j++) {
                if(array[lowestPosition] > array[j]) {
                    lowestPosition = j;
                }
                
                if(array[lowestPosition] < array[lowestPositionStart]) {
                    int temp = array[lowestPosition];
                    array[lowestPosition] = array[lowestPositionStart];
                    array[lowestPositionStart] = temp;
                }
            }
        }
    }
    public void displayArrayItems() {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
