package SortingAlgorithms;

public class SelectionSort {
    public void sorting(int[] numbers){
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++){
            int minKey = i; // gia su tim dc vi tri cua phan tu nho nhat
            for (int j = i + 1; j < size; j++){
                if (numbers[j] > numbers[minKey]){
                    minKey = j;
                }
            }
            //Swap : doi cho (Bubble sort)
            int tmp = numbers[i];
            numbers[i] = numbers[minKey];
            numbers[minKey] = tmp;
        }
    }
    public void showArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
