import java.util.Scanner;

public class lab1b {
    public static int[] mulArray(int[] a, int[] b) {
        int len = a.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the lengths of arrays to be multiplied: ");
        n = sc.nextInt();

        int[] n1 = new int[n];
        int[] n2 = new int[n];

        System.out.println("Enter elements of first array: ");
        for (int i = 0; i < n; i++) {
            n1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array: ");
        for (int i = 0; i < n; i++) {
            n2[i] = sc.nextInt();
        }

        int[] mult = mulArray(n1, n2);

        System.out.println("Result of elementwise multiplication of given arrays is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mult[i] + " ");
        }
        sc.close();
    }
}
