package task_18;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        Function<Integer,String> function = (num)->{
            if(num > 0) {
                return "Положительное число";
            } else if (num < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        System.out.println(function.apply(digit));
    }
}
