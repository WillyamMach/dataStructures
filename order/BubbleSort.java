public class BubbleSort {
    private int array[] = {20, 30, 10, 50, 40, 90, 70, 80, 60};
    
    public void order() {
        int temp;

        for(int i = 0; i < array.length - 1; i++) {
            for(int position = 0; position < array.length - i - 1; position++) {
                if(array[position] > array[position + 1]) {
                    temp = array[position];
                    array[position] = array[position + 1];
                    array[position + 1] = temp;
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
