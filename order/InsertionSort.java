public class InsertionSort {
    private int array[] = {20, 30, 10, 50, 40, 90, 70, 80, 60, 11, 33, 66, 23, 9};

    public void order() {
        int j = 0, card = 0;

        for(int i = 1; i < array.length; i++) {
            card = array[i];

            for(j = i - 1; (j>=0) && array[j] > card; j--) {
                array[j+1] = array[j];
            }

            array[j+1] = card;
        }  
    }

    public void displayArrayItems() {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
