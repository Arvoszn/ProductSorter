public class QuickSort {

    public static void sort(Product[] products) {
        if (products == null || products.length < 2) {
            return;
        }
        quickSort(products, 0, products.length - 1);
    }

    private static void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(products, low, high);
            quickSort(products, low, pivotIndex - 1);
            quickSort(products, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        Product pivot = products[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (products[j].getQuantity() <= pivot.getQuantity()) {
                i++;
                swap(products, i, j);
            }
        }

        swap(products, i + 1, high);
        return i + 1;
    }

    private static void swap(Product[] products, int a, int b) {
        Product temp = products[a];
        products[a] = products[b];
        products[b] = temp;
    }
}
