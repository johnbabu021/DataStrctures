import java.util.Scanner;

public class SwapHack {

    public static void swapArray() {
        int[] array = new int[10];
        System.out.println("enter the numver of swapping");
        Scanner first = new Scanner(System.in);
        int t = first.nextInt();
        for (int m = 0; m < t; m++) {
            System.out.println("enter the size of array");
            Scanner arraySize = new Scanner(System.in);
            int n = arraySize.nextInt();
            System.out.println("enter the iterative count");

            Scanner iterateCount = new Scanner(System.in);
            int k = iterateCount.nextInt();
            System.out.println("enter the array inputs");

            for (int i = 0; i < n; i++) {
                Scanner arrayElements = new Scanner(System.in);
                int eachElement = arrayElements.nextInt();
                array[i] = eachElement;
            }
            if (k < n) {
                System.out.println("true");
                int length = n - 1;
                int i = n - k;
                for (int j = i; j <= length; j++) {
                    System.out.println(array[j]);
                }
                for (int u = 0; u < i; u++) {
                    System.out.println(array[u]);
                }
            }
        }

    }

    public static void main(String[] args) {
        swapArray();
    }

}
