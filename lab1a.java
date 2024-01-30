import java.util.Scanner;

public class lab1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calculate the discriminant
        double disc = b * b - 4 * a * c;

        // Check if the discriminant is non-negative
        if (disc >= 0) {
            // Calculate the roots
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);

            // Display the roots
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else {
            // If discriminant is negative, roots are imaginary
            double real = -b / (2 * a);
            double imag = Math.sqrt(-disc) / (2 * a);

            // Display the roots as complex numbers
            System.out.println("Root 1: " + real + " + " + imag + "i");
            System.out.println("Root 2: " + real + " - " + imag + "i");
        }

        sc.close();
    }
}

