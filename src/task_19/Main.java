package task_19;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 11);

        int randomNum = supplier.get();

        System.out.println(randomNum);
    }
}
