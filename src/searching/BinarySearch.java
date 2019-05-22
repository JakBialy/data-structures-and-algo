package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(iterativeBinarySearch(sortedArray, -15));
        System.out.println(iterativeBinarySearch(sortedArray, -22));
        System.out.println(iterativeBinarySearch(sortedArray, 888));
    }

    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){

            int midPoint = (start + end) / 2;
            System.out.println("mid point " + midPoint);
            if (input[midPoint] == value){
                return midPoint;
            } else if (input[midPoint] < value){
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }

        return -1;
    }

}
