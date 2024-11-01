package W7_7b;

import java.util.Arrays;

public class Pq<T extends Comparable<T>> implements PriorityQueue<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public Pq(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void insert(T element) {
        if (size == array.length) {
            System.out.println("Priority Queue is full");
            return;
        }
        array[size] = element;
        size++;
        Arrays.sort(array, 0, size);
    }

    public T remove() {
        if (size == 0) {
            return null;
        }
        T removed = array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        size--;
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
