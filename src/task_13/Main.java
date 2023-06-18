package task_13;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> notNullString = str -> str != null;
        String str = "";
        if (notNullString.test(str)) {
            System.out.println("String is not null");
        }
    }
}
