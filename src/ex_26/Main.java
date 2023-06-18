package ex_26;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "j", "k");
        List<String> filteredList = list.stream().filter(new Predicate<String>() {
            int counter = 1;

            @Override
            public boolean test(String s) {
                return counter++ % 5 != 0;
            }
        }).toList();
        System.out.println(filteredList);
    }
}
