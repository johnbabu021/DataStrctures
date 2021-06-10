import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int[] resultedArray = bubbleSortHelper(array);
        // System.out.println('h');

        return resultedArray;

    }

    private static int[] bubbleSortHelper(int[] array) {

        int startIdx = 0;
        int endIdx = array.length - 1;
        while (startIdx <= endIdx) {
            for (int i = startIdx; i <= endIdx; i++) {
                if (i == endIdx) {

                    endIdx--;
                    break;
                }
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 31, 5, 10, 7, 1, 0, 11, 8 };
        System.out.println(bubbleSort(array));
        int[] result = bubbleSort(array);
        Arrays.stream(result).forEach(System.out::println);

    }

}
