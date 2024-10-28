import java.util.*;

public class Company {
    private String name;
//    private List<Department> departments = new ArrayList<>();
    private Map<String, Set<Employee>> departmentEmployeeMap = new HashMap<>();

    public Company(){
    }

    public void addEmployeeToDepartment(String department, Employee employee){

    }


//    public void addEmployeeToDepartment(Employee employee, Department department){
//        for (Department department1 : departments) {
//            if (department1.equals(department)){
//                department1.addEmployee(employee);
//            }
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }
}
