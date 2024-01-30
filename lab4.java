import java.util.sc;

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Employee extends Person{
    private String employeeId;

    public Employee(String name, int age, char gender, String employeeId) {
        super(name, age, gender);
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Type: Regular");
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, char gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Type: Full-Time");
    }
}

public class lab4{
    public static void main(String[] args) {
        sc sc = new sc(System.in);

        // Display details of employees
        System.out.println("Enter details for Employees:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEmployee " + i + " details:");
            System.out.print("Name: ");
            String empName = sc.nextLine();
            System.out.print("Age: ");
            int empAge = sc.nextInt();
            sc.nextLine(); // consume the newline character
            System.out.print("Gender (M/F): ");
            char empGender = sc.nextLine().charAt(0);
            System.out.print("Employee ID: ");
            String empId = sc.nextLine();

            Employee employee = new Employee(empName, empAge, empGender, empId);
            employee.displayDetails();
        }

        // Display details of students
        System.out.println("\nEnter details for Students:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i + " details:");
            System.out.print("Name: ");
            String studentName = sc.nextLine();
            System.out.print("Age: ");
            int studentAge = sc.nextInt();
            sc.nextLine(); // consume the newline character
            System.out.print("Gender (M/F): ");
            char studentGender = sc.nextLine().charAt(0);
            System.out.print("Student ID: ");
            String studentId = sc.nextLine();

            Student student = new Student(studentName, studentAge, studentGender, studentId);
            student.displayDetails();
        }

        sc.close();
    }
}
