package W7_7b;

public interface PriorityQueue<T extends Comparable<T>> {
	void insert(T element);
    T remove();
    boolean isEmpty();

}
