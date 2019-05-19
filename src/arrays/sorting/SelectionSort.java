package arrays.sorting;

import arrays.helpers.SwapHelper;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        selectionSort(new int[] {20, 35, -15, 7, 55, 1, -22});
    }

    private static void selectionSort(int[] numbersToSort){

        for (int lastUnsortedIndex = numbersToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            // looking for the largest number in array
            // with exclusion of already found and set
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (numbersToSort[i] > numbersToSort[largest]){
                    largest = i;
                }
            }

            SwapHelper.swap(numbersToSort, largest, lastUnsortedIndex);

        }

        Arrays.stream(numbersToSort).forEach(System.out::println);
    }
}

