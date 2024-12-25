public interface ShoppingCartVisitor {

    double visit(Electronic electronic);
    double visit(Clothes clothes);
    double visit(Grocery grocery);
}
