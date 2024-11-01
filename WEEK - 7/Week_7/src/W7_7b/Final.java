package W7_7b;

import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data type (Integer, Double, or String): ");
        String dataType = scanner.next();

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        PriorityQueue<?> priorityQueue = new Pq<>(numElements);

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            if (dataType.equalsIgnoreCase("Integer")) {
                ((Pq<Integer>) priorityQueue).insert(scanner.nextInt());
            } else if (dataType.equalsIgnoreCase("Double")) {
                ((Pq<Double>) priorityQueue).insert(scanner.nextDouble());
            } else if (dataType.equalsIgnoreCase("String")) {
                ((Pq<String>) priorityQueue).insert(scanner.next());
            }
        }

        System.out.println("Priority Queue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}