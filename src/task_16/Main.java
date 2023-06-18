package task_16;

import java.security.Principal;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Predicate<String> checkString = str -> {
            return (str.startsWith("N") || str.startsWith("J")) && str.endsWith("A");
        };
        System.out.println(checkString.test(input));
    }


}
