import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i <= array.length - 1; i++) {
            int smallest = array[i];
            int j = i + 1;
            // System.out.println(j);

            while (j <= array.length - 1 && array[j] < smallest) {
                // System.out.println(j);
                int temp = smallest;
                smallest = array[j];
                array[j] = temp;
                j++;

            }
            array[i] = smallest;
            // System.out.println(array[i]);
            // System.out.println('h');
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = { 4, 3, 2 };
        int[] result = selectionSort(array);
        Arrays.stream(result).forEach(System.out::println);

    }
}
