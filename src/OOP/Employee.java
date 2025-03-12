package OOP;

public class Employee {
    String name;
    int age;
    double salary;
    String location;

    Employee (String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        this.salary = this.salary + (this.salary * 0.05);
    }
    void announceEmployee() {
        System.out.println("The employee's name is " + this.name + " and the persons age is " + this.age + ".");
        System.out.println(this.name + " lives in " + this.location + " and their monthly salary is " + this.salary + ".");
    }
}
