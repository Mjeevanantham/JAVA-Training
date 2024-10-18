package modifier;

 public class Employee extends Person {
    protected double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
    }
}