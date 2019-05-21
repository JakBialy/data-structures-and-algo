package arrays.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 2, 2, 4, 7, 9 ,10, 7, 7};

        countingSort(intArray, 1, 10);

        Arrays.stream(intArray).forEach(System.out::println);
    }

    public static void countingSort(int[] input, int min, int max){

        int[] countArray = new int[(max - min) +1];

        // counting phase
        // min is for skipping unused values
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        // array tracker
        int j = 0;
        // re-creating array
        // inserting values at right position
        for (int i = min; i <= max; i++) {
            while(countArray[i-min] > 0){
                // adding sorted values into initial array
                input[j++] = i;
                // decreasing number in counting array
                countArray[i - min]--;
            }
        }

    }
}
