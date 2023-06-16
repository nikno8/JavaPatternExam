package Builder;

public class ConcreteBuilder implements Builder{
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    public void buildPartA() {
        product.setPartA("Part A");
    }

    public void buildPartB() {
        product.setPartB("Part B");
    }

    public void buildPartC() {
        product.setPartC("Part C");
    }

    public Product getProduct() {
        return product;
    }
}
