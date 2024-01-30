import java.util.sc;

public class lab1c {
    public static void bbsort_asc(int[] array) {
        int n = array.length;
        System.out.print(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bbsort_desc(int[] array) {
        int n = array.length;
        System.out.print(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        sc sc = new sc(System.in);
        int n;
        System.out.println("Enter the length of array to be sorted: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] array_asc = arr;
        int[] array_desc = arr;
        System.out.println("Original array: ");
        display(arr);

        System.out.println("\nSort in ascending order: ");
        bbsort_asc(array_asc);
        display(array_asc);

        System.out.println("\nSort in descending order: ");
        bbsort_desc(array_desc);
        display(array_desc);

        sc.close();
    }
}
