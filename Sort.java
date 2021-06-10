import java.util.Arrays;

public class Sort {

    public static int[] insertionSort(int[] array) {

        for (int i = 1; i <= array.length - 1; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 2, 1, 3, 5, 3 };
        int[] result = insertionSort(array);
        Arrays.stream(result).forEach(System.out::println);

    }
}
