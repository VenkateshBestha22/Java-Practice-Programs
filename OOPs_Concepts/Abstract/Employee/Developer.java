package OOPs_Concepts.Abstract.Employee;

public class Developer extends Employee {
    public Developer(String name, int salary){
        super(name, salary);
    }
    public void work() {
        System.out.println(name+ "is Developer, Developer Writing Java Code");
    }
}
