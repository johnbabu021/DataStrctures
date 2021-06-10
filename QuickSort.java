import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
        return array;

    }

    private static void quickSortHelper(int[] array, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int pivot = startIdx;
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while (leftIdx <= rightIdx) {
            if (array[leftIdx] > array[pivot] && array[rightIdx] < array[pivot]) {
                swap(array, leftIdx, rightIdx);
                leftIdx++;
                rightIdx--;

            }
            if (array[leftIdx] <= array[pivot]) {
                leftIdx++;

            }
            if (array[rightIdx] >= array[pivot]) {
                rightIdx--;
            }

        }
        // System.out.println(leftIdx + pivot);
        swap(array, rightIdx, pivot);
        quickSortHelper(array, startIdx, rightIdx - 1);
        quickSortHelper(array, rightIdx + 1, endIdx);
    }

    private static void swap(int[] array, int leftIdx, int rightIdx) {
        int temp = array[leftIdx];
        array[leftIdx] = array[rightIdx];
        array[rightIdx] = temp;
        // System.out.println(array[rightIdx]);
    }

    public static void main(String[] args) {
        int[] array = { 6, 7, 4 };
        int[] result = quickSort(array);
        Arrays.stream(result).forEach(System.out::println);
    }

}
