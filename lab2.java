import java.util.Scanner;

class employee {

    public String name;
    int emp_id;
    String dept;
    int age;
    String designation;
    float salary;

    public employee(String name, int emp_id, String dept, int age, String designation, float salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.dept = dept;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void printdata() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + emp_id);
        System.out.println("dept: " + dept);
        System.out.println("age: " + age);
        System.out.println("designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        employee[] obj = new employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of employee " + (i + 1));
            System.out.println("Enter the name,EMP_ID,Department,age,designation and salary");
            String name = sc.next();
            int emp_id = sc.nextInt();
            String dept = sc.next();
            int age = sc.nextInt();
            String designation = sc.next();
            float salary = sc.nextFloat();

            obj[i] = new employee(name, emp_id, dept, age, designation, salary);
        }
        System.out.println("Details of employees are: ------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Details of employee " + (i + 1));
            obj[i].printdata();

        }
        int total = 0;
        System.out.println("Sum of salaries of sales department ");
        for (int i = 0; i < n; i++) {
            if (obj[i].dept.compareTo("sales") == 0) {
                total += obj[i].salary;
            }
        }
        System.out.println(total);

        System.out.println("Details of highest paid manager in purchase department ");
        float max = 0;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (obj[i].dept.compareTo("purchase") == 0 && obj[i].designation.compareTo("manager") == 0) {
                max = obj[i].salary;
            }
            if (obj[i].salary > max) {
                max = obj[i].salary;
            }
            ind = i;
        }
        obj[ind].printdata();

        System.out.println("Details of employees of sales dept after increment: ------------------");
        for (int i = 0; i < n; i++) {
            if (obj[i].dept.compareTo("sales") == 0) {
                obj[i].salary += (0.1 * obj[i].salary);
            }
            obj[i].printdata();
        }
        sc.close();

    }
}
