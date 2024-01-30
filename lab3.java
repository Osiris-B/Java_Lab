import java.util.sc;

class complex {
    int real, img;

    public complex(){
        this.real = 0;
        this.img = 0;
    }

    public complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public void read(sc sc) {
        System.out.print("Enter the real part: ");
        real = sc.nextInt();
        System.out.print("Enter the imaginary part: ");
        img = sc.nextInt();
    }

    public void display() {
        System.out.println("(" + this.real + "+" + this.img + "i)");
    }

    public static complex add(complex c1, complex c2) {
        complex obj = new complex();
        obj.real = c1.real + c2.real;
        obj.img = c1.img + c2.img;
        return obj;
    }

    public static complex diff(complex c1, complex c2) {
        complex obj = new complex(0, 0);
        obj.real = c1.real - c2.real;
        obj.img = c1.img - c2.img;
        return obj;
    }

    public static complex increment(complex c) {
        c.real++;
        c.img++;
        return c;
    }

    public static complex decrement(complex c) {
        c.real--;
        c.img--;
        return c;
    }

    public static complex compare(complex c1, complex c2) {
        if (c1.real == c2.real && c1.img == c2.img) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are NOT equal.");
        }
        return c1;
    }
}

public class lab3 {
    public static void main(String[] args) {
        sc sc = new sc(System.in);

        complex c1 = new complex();
        complex c2 = new complex();

        System.out.println("Enter the first complex number: ");
        c1.read(sc);
        c1.display();

        System.out.println("Enter the second complex number: ");
        c2.read(sc);
        c2.display();

        int choice = -1;
        System.out.println("Choose the following operations on the complex numbers:");
        while (choice != 0) {
            System.out.println(
                    "Enter 1 for addition, 2 for difference, 3 for increment, 4 for decrement, 5 for comparison, or 0 to EXIT.");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    complex sum = complex.add(c1, c2);
                    System.out.println("Sum: ");
                    sum.display();
                    break;
                }
                case 2: {
                    complex sub = complex.diff(c1, c2);
                    System.out.println("Difference: ");
                    sub.display();
                    break;
                }
                case 3: {
                    complex n1 = complex.increment(c1);
                    System.out.println("1st number incremented: ");
                    n1.display();
                    complex n2 = complex.increment(c2);
                    System.out.println("2nd number incremented: ");
                    n2.display();
                    break;
                }
                case 4: {
                    complex n1 = complex.decrement(c1);
                    System.out.println("1st number decremented: ");
                    n1.display();
                    complex n2 = complex.decrement(c2);
                    System.out.println("2nd number decremented: ");
                    n2.display();
                    break;
                }
                case 5: {
                    complex.compare(c1, c2);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Invalid choice!!!");
                }
            }
        }
    }
}
