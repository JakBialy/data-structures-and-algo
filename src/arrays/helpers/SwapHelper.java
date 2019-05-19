package arrays.helpers;

public class SwapHelper {

    // just swapping left side element with right one
    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
