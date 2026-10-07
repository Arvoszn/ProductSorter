 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuickSort;

/**
 *
 * @author User
 */
public class ProductCountSorter {

    private int stepCount = 0;

    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        System.out.println("=== QuickSort Breakdown ===\n");
        System.out.print("Initial array: ");
        printArray(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\n=== Sort Complete ===");
        System.out.print("Final array:   ");
        printArray(arr);
        System.out.println("\nTotal steps: " + stepCount);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.println("--- Step " + (++stepCount) + " ---");
            System.out.println("Sub-array [" + low + ".." + high + "]: ");
            printSubArray(arr, low, high);
            System.out.println("Pivot chosen: " + arr[high]);

            int pivotIndex = partition(arr, low, high);

            System.out.println("After partition: ");
            printSubArray(arr, low, high);
            System.out.println("Pivot " + arr[pivotIndex] + " placed at index " + pivotIndex);
            System.out.println();

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    private void printSubArray(int[] arr, int low, int high) {
        System.out.print("        [ ");
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {200, 312,115,216,207 , 401}; 
        ProductCountSorter pr = new ProductCountSorter();
        pr.sort(arr);
    }
}
