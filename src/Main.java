import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCartVisitor priceVisitor = new PriceCalculatorVisitor();

        final List<Item> carts = new ArrayList<>();
        carts.add(new Electronic("Phone", 10000));
        carts.add(new Clothes("Jeans", 3000));
        carts.add(new Grocery("Chips", 10));

        double totalPrice = 0;

        for (Item item: carts) {
            totalPrice += item.accept(priceVisitor);
        }

        System.out.println("Totol price of the cart is: " + totalPrice);

    }
}