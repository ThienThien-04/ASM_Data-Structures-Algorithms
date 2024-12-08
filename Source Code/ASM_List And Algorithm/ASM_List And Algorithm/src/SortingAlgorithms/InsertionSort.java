package SortingAlgorithms;

public class InsertionSort {
    public void sorting(int[] numbers){
        int size = numbers.length;
        for (int i = 0; i < size; i++){
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }
    public void showArray(int[] arrayNumber){
        for (int i = 0; i < arrayNumber.length; i++){
            System.out.println("key = " + i + "; item = " + arrayNumber[i]);
        }
    }
}
