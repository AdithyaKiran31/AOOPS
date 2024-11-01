package W7_7a;

class ArrayStack<T> implements Stack<T> {
    private Object[] array;
    private int top;

    public ArrayStack(int size) {
        array = new Object[size];
        top = -1;
    }

    public void push(T element) {
        if (top == array.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[top--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
