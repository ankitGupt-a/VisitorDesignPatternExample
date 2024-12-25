public class Electronic implements Item{
    private final double price;
    private final String name;

    public Electronic(final String name, final double price) {
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
