package SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] randomNumbers = {1,3,2,9,6,4,8,5};
        bubbleSort.sorting(randomNumbers);
        bubbleSort.printArray(randomNumbers);

        int[] randoms = {1,3,2,9,6,4,8,5};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sorting(randoms);
        insertionSort.showArray(randoms);

        int[] arrayNumber = {1,3,2,9,6,4,8,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sorting(arrayNumber);
        selectionSort.showArray(arrayNumber);

        int[] array = {1,3,2,9,6,4,8,5};
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(array, 0, array.length-1);
        mergeSort.showArray(array);



        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array **** Quick Sort");
        System.out.println(Arrays.toString(data));
        int size = data.length;
        // call quicksort() on array data
        QuickSort.quickSort(data, 0, size - 1);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
