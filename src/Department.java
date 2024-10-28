import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Employee> employeeSet = new HashSet<>();

    private Department(String name){
        this.name = name;
    }

    public void printEmployeeSet(){
        if (employeeSet.isEmpty()){
            System.out.println("There is no employee");
            return;
        }
        System.out.println("Print Employees: ");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
    // add method
    public void addEmployee(Employee employee){
        employeeSet.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
