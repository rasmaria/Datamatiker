package OOP;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria", 30, 70000, "CPH");
        Employee employee2 = new Employee("Hank", 56, 41276.50, "London");

        employee1.announceEmployee();
        System.out.println();
        employee2.announceEmployee();
        System.out.println();

        employee1.raiseSalary();
        System.out.println(employee1.name + " got a 5% raise and the new salary is: " + employee1.salary);
        employee1.announceEmployee();

    }

}
