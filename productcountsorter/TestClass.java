public class TestClass {

    public static void main(String[] args) {
        Product[] products = {
            new Product("P-101", "Laptop", "Electronics", 25),
            new Product("P-102", "Notebook", "Stationery", 140),
            new Product("P-103", "Ballpen", "Stationery", 320),
            new Product("P-104", "Mouse", "Electronics", 60),
            new Product("P-105", "Backpack", "Bags", 12),
            new Product("P-106", "Water Bottle", "Grocery", 85),
            new Product("P-107", "Desk Lamp", "Furniture", 5),
            new Product("P-108", "Keyboard", "Electronics", 48)
        };

        System.out.println("=================================================");
        System.out.println("  Product Count Sorter - Quicksort (Lowest to Highest)");
        System.out.println("=================================================\n");

        System.out.println("Products BEFORE sorting:");
        printHeader();
        printProducts(products);

        QuickSort.sort(products);

        System.out.println("\nProducts AFTER sorting (by quantity, lowest to Highest):");
        printHeader();
        printProducts(products);

        System.out.println("\nTop 3 Lowest Products based on quantity:");
        printHeader();
        int topN = Math.min(3, products.length);
        for (int i = 0; i < topN; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printHeader() {
        System.out.println("-------------------------------------------------");
        System.out.println("ID      | NAME               | CATEGORY     | QTY");
        System.out.println("-------------------------------------------------");
    }

    private static void printProducts(Product[] products) {
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------------------");
    }
}
