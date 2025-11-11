package OOPs_Concepts.Abstract.Employee;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Developer("Venkatesh ", 40000);
        Employee mngr = new Manager("Sakhi",50000);

        emp1.showDetails();
        emp1.work();

        mngr.showDetails();
        mngr.work();
    }
}
