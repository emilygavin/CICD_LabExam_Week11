import java.util.ArrayList;

public class EmployeeList extends Employee{
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> getAllEmployees(){
        return employees;
    }

//    public Boolean findEmployeesByPps(Employee employee){
//        if(!employees.get(employees.size())){
//
//        }
//        else{
//
//        }
//    }
}
