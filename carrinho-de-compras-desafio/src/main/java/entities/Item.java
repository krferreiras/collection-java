package entities;

public class Item {
    private String name;
    private Double price;
    private Integer quantity;

    private Double totalValue;

    public Item(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + ", R$ " + price + ", " + quantity;
    }

    public void calcularValorTotal(double price, Integer quantity) {
        totalValue += (price * quantity);
    }
}
