package w8_8a;

import java.util.List;

public class Final {
    public static void main(String[] args) {
        UserInputHandler userInputHandler = new UserInputHandler();
        List<String> strings = userInputHandler.getInputFromUser();
        DescendingStringSorter sorter = new DescendingStringSorter();
        sorter.sort(strings);
        System.out.println("Sorted list in descending order: " + strings);
    }
}