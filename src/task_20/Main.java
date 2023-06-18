package task_20;



public class Main {
    public static void main(String[] args) {
        Printable printable = MyClass::printHello; // использование ссылки на статический метод
        printable.print();
    }
}
