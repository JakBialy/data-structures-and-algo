package arrays.sorting;

import arrays.helpers.SwapHelper;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(new int[] {20, 35, -15, 7, 55, 1, -22});

    }

    private static void bubbleSort(int[] numbersToSort) {

        // outer loops is for determine numbers of loops until we get all elements sorted
        // assuming that in the end last element is always in right place
        // helping with performance
        for (int lastUnsortedIndex = numbersToSort.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                int nextElement = i + 1;
                if (numbersToSort[i] > numbersToSort[nextElement]){
                    SwapHelper.swap(numbersToSort, i, nextElement);
                }

            }
        }

        Arrays.stream(numbersToSort).forEach(System.out::println);
    }

}
