package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(linearSearch(array, -15));
        System.out.println(linearSearch(array, -10));
        System.out.println(linearSearch(array, 7));

    }

    private static boolean linearSearch(int[] ints, int toFind) {
        for (int toLook: ints) {
            if (toLook == toFind){
                return true;
            }
        }
        return false;
    }
}
