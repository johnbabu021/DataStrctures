import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxHeap {
    List<Integer> heap = new ArrayList<>();

    MaxHeap(List<Integer> array) {
        buildHeap(array);
    }

    private void buildHeap(List<Integer> array) {
        heap = array;
        for (int i = heap.size() - 1; i >= 0; i--) {
            shiftDown(i);

        }

    }

    private void shiftDown(int currentIdx) {

        int endIdx = heap.size() - 1;
        int leftIdx = leftChild(currentIdx);
        while (leftIdx <= endIdx) {
            int rightIdx = rightChild(currentIdx);
            int idxToShift;
            if (rightIdx <= endIdx && heap.get(rightIdx) > heap.get(leftIdx)) {
                idxToShift = rightIdx;
            } else {
                idxToShift = leftIdx;
            }
            if (heap.get(idxToShift) > heap.get(currentIdx)) {
                Collections.swap(heap, idxToShift, currentIdx);
                currentIdx = idxToShift;
                leftIdx = leftChild(currentIdx);
            } else {
                return;
            }
        }

    }

    private void shiftUp(int currentIdx) {

        int parentIdx = parent(currentIdx);
        while (currentIdx > 0 && heap.get(currentIdx) > heap.get(parentIdx)) {
            Collections.swap(heap, currentIdx, parentIdx);
            currentIdx = parentIdx;
            parentIdx = parent(currentIdx);
        }

    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return (2 * i) + 1;
    }

    private int rightChild(int i) {
        return (2 * i) + 2;
    }

    public void addHeap(int data) {
        heap.add(data);
        shiftUp(heap.size() - 1);
    }

    public void remove() {
        Collections.swap(heap, 0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        shiftDown(0);
    }

    public void display() {
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));

        }
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(6, 2, 8));
        MaxHeap heap = new MaxHeap(array);
        heap.addHeap(10);
        heap.remove();
        heap.display();

    }

}
