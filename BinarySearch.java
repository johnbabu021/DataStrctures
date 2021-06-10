
public class BinarySearch {

    public static int binaryIter(int[] array, int target) {

        int startIdx = 0;
        int endIdx = array.length - 1;
        while (startIdx <= endIdx) {

            int middle = startIdx + (endIdx - startIdx) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                endIdx = middle - 1;
            } else if (array[middle] < target) {
                startIdx = middle + 1;
            }
        }

        return -1;
    }

    public static int binaryRec(int[] array, int target) {

        return binaryRecvHelper(array, target, 0, array.length - 1);
    }

    public static int binaryRecvHelper(int[] array, int target, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return -1;
        }
        int middle = startIdx + (endIdx - startIdx) / 2;
        if (array[middle] == target) {
            return middle;
        } else if (array[middle] > target) {
            return binaryRecvHelper(array, target, startIdx, middle - 1);
        } else {
            return binaryRecvHelper(array, target, middle + 1, middle);
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        // System.out.println(binaryIter(array, 4));
        System.out.println(binaryRec(array, 13));

    }

}
