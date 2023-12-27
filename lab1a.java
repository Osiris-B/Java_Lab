import java.util.Scanner;

public class lab1a {
    public static float calcArea(float l, float b) {
        return l * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, breadth, area;

        System.out.println("Enter the length and breadth of rectangle to calculate its area: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();

        area = calcArea(length, breadth);
        System.out.println("Area of given rectangle is: " + area);
        sc.close();
    }
}
