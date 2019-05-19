package arrays.sorting;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        selectionSort(new int[] {20, 35, -15, 7, 55, 1, -22});
    }

    private static void selectionSort(int[] numbersToSort){

        // gap calculation, outer looping
        for (int gap = numbersToSort.length / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < numbersToSort.length; i++) {
                // saving new element
                int newElement = numbersToSort[i];

                int j = i;

                // checking if previous element is bigger and if we have j bigger than actual gap
                while (j >= gap && numbersToSort[j - gap] > newElement){
                    numbersToSort[j] = numbersToSort[j - gap];
                    // loop decrementing by gap value
                    // taking care of not going out of array size and allowing for
                    // doing more than one check
                    j -= gap;
                }

                numbersToSort[j] = newElement;
            }
        }

        Arrays.stream(numbersToSort).forEach(System.out::println);
    }

}
