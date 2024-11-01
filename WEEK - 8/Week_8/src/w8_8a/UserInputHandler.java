package w8_8a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputHandler {
    public List<String> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings.add(scanner.next());
        }
        return strings;
    }
}