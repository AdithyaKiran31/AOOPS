
package W7_7a;
import java.util.Scanner;
public class Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data type (Integer, Float, Character, or String): ");
        String dataType = scanner.next();

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        Stack stack = getStack(dataType, numElements, scanner);

        System.out.println("Stack using " + stack.getClass().getSimpleName() + ":");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static Stack getStack(String dataType, int numElements, Scanner scanner) {
        Stack stack;
        if (dataType.equalsIgnoreCase("Integer")) {
            stack = new LinkedListStack<>();
            for (int i = 0; i < numElements; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                ((LinkedListStack<Integer>) stack).push(scanner.nextInt());
            }
        } else if (dataType.equalsIgnoreCase("Float")) {
            stack = new LinkedListStack<>();
            for (int i = 0; i < numElements; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                ((LinkedListStack<Float>) stack).push(scanner.nextFloat());
            }
        } else if (dataType.equalsIgnoreCase("Character")) {
            stack = new LinkedListStack<>();
            for (int i = 0; i < numElements; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                ((LinkedListStack<Character>) stack).push(scanner.next().charAt(0));
            }
        } else if (dataType.equalsIgnoreCase("String")) {
            stack = new LinkedListStack<>();
            for (int i = 0; i < numElements; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                ((LinkedListStack<String>) stack).push(scanner.next());
            }
        } else {
            System.out.println("Invalid data type. Exiting.");
            return null;
        }
        return stack;
    }
}
