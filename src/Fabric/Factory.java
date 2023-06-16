package Fabric;

// Фабрика
class Factory {
    public static Product createProduct(String name) {
        if (name.equals("product1")) {
            return new ConcreteProduct1();
        } else if (name.equals("product2")) {
            return new ConcreteProduct2();
        } else {
            return null;
        }
    }
}
