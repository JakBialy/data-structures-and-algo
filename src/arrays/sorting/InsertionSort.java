package arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        insertionSort(new int[] {20, 35, -15, 7, 55, 1, -22});

    }

    private static void insertionSort(int[] numbersToSort){

        // starting with first element as a "sorted" part, we are looping till the unsorted element index
        // is smaller than length of array, so til job is done
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbersToSort.length; firstUnsortedIndex++) {
            // saving new element as it is going to be overwritten in array
            int newElement = numbersToSort[firstUnsortedIndex];

            int j;

            // looping through the sorted part of array till we hit the end and new element is smaller
            for (j = firstUnsortedIndex; j > 0 && numbersToSort[j - 1] > newElement; j--) {
                numbersToSort[j] = numbersToSort[j - 1];
            }

            // after going out of a loop (so j is the correct place for new element, inserting at right position)
            numbersToSort[j] = newElement;
        }


        Arrays.stream(numbersToSort).forEach(System.out::println);

    }

}
