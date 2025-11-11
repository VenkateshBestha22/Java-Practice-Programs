package OOPs_Concepts.Abstract.Employee;

public  abstract class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract void work();

    public void showDetails() {
        System.out.println("Employee: " + name + " | Salary: "+ salary);
    }
}
