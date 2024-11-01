package w8_8a;

import java.util.List;

public class DescendingStringSorter implements StringSorter {
    @Override
    public void sort(List<String> list) {
        list.sort((s1, s2) -> s2.compareTo(s1));
    }
}