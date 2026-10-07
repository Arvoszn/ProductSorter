public class Product {
    private String productId;
    private String name;
    private String category;
    private int quantity;

    public Product(String productId, String name, String category, int quantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-18s | %-12s | %d",
                productId, name, category, quantity);
    }
}
