package arrays.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);

        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void quickSort(int[] input, int start, int end) {
        if (end - start < 2){
            return;
        }

        // calculating pivot position
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // this is using first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){

            // empty loop
            while(i < j && input[--j] >= pivot);

            if (i < j){
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);

            if (i < j){
                input[j] = input[i];
            }
        }
        return j;
    }
}
