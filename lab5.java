import java.util.Scanner;

public class lab5 {
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean compareStrings(String str1, String str2, int n_char) {
        if (n_char <= 0) {
            System.out.println("Invalid number of characters for comparison.");
            return false;
        }

        String substr1 = str1.substring(0, Math.min(n_char, str1.length()));
        String substr2 = str2.substring(0, Math.min(n_char, str2.length()));

        return substr1.equals(substr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        boolean result;

        System.out.println(
                "Enter your choice: \n(1) Compare two strings fully\n(2)Compare two strings for a given number of characters\n");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                result = compareStrings(str1, str2);
                break;
            case 2:
                System.out.println("Enter the number of characters to be compared:");
                int n = sc.nextInt();
                result = compareStrings(str1, str2, n);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }
        System.out.println("Are the two strings same: " + result);
        sc.close();
    }
}
