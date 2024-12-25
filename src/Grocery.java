public class Grocery implements Item{
    private final String name;
    private final double price;

    public Grocery(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
