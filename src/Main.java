import model.Employee;

public class Main {
    public static void main(String[] args) {
        //a.
        Employee newEmployee = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        //b.
        Employee newEmployee2 = new Employee(34234123, "Ana", "Sanchez", 27500);
        //c.
        System.out.println(newEmployee.getDescription());
        System.out.println(newEmployee2.getDescription());
        newEmployee.increaseSalary(15);
        System.out.println("Anual Salary : :" +newEmployee.getAnualSalary());
        

    }
}