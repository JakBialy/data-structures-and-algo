package arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // outer loops is for determine numbers of loops until we get all elements sorted
        // assuming that in the end last element is always in right place
        // helping with performance
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                int nextElement = i + 1;
                if (intArray[i] > intArray[i + nextElement]){
                    swap(intArray, i, nextElement);
                }

            }
        }

        Arrays.stream(intArray).forEach(System.out::println);

    }

    // just swapping left side element with right one
    private static void swap(int[] array, int leftSide, int rightSide){

        if(leftSide == rightSide){
            return;
        }

        int temp = array[leftSide];
        array[leftSide] = array[rightSide];
        array[rightSide] = temp;


    }

}
