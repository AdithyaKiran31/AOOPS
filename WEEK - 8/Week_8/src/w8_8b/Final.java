package w8_8b;

import java.util.*;

public class Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        StreamEvenNumberDoubler doubler = new StreamEvenNumberDoubler();
        List<Integer> doubledEvenNumbers = doubler.doubleEvenNumbers(numbers);
        System.out.println("Doubled even numbers: " + doubledEvenNumbers);
    }
}