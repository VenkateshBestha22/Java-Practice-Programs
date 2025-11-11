package OOPs_Concepts.Abstract.Employee;

public class Manager extends  Employee{

    public Manager(String name, int salary){
        super(name,salary);
    }
    public void work() {
        System.out.println(name + " is Manager and she  managing the team");
    }
}
