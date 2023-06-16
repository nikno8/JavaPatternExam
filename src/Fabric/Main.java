package Fabric;

// Пример использования
public class Main {
    public static void main(String[] args) {
        Product product1 = Factory.createProduct("product1");
        Product product2 = Factory.createProduct("product2");

        product1.getName(); // Вывод: Продукт 1
        product2.getName(); // Вывод: Продукт 2
    }
}