package task_15;

import java.util.Scanner;
import java.util.function.Predicate;

public class StringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        Predicate<String> notNull = str -> str != null;
        Predicate<String> notEmpty = str -> !str.isEmpty();

        Predicate<String> notNullOrEmpty = notNull.and(notEmpty);

        if (notNullOrEmpty.test(input)) {
            System.out.println("Строка не null и не пуста");
        } else {
            System.out.println("Строка null или пуста");
        }
    }
}