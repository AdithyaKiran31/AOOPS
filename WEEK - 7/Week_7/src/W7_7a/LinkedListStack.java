package W7_7a;

class LinkedListStack<T> implements Stack<T> {
    private Node<T> head;

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
