public class PriceCalculatorVisitor implements ShoppingCartVisitor{

    public double visit(final Electronic electronic) {
        System.out.println("Calculating price for an electronic item");
        return electronic.getPrice();
    }

    public double visit(final Clothes clothes) {
        System.out.println("Calculating proce for a cloth item");
        return clothes.getPrice();
    }

    public double visit(final Grocery grocery) {
        System.out.println("Calculating price for a grocery item");
        return grocery.getPrice();
    }
}
