import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        EmployeeList employeeList = new EmployeeList();

        Employee employee = new Employee();
        System.out.println("please enter employee name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        employee.setName(name);
        System.out.println("Name entered: " + employee.getName());

        System.out.println("please enter employee pss: ");
        Scanner scanner2 = new Scanner(System.in);
        String pps = scanner2.next();
        employee.setPps(pps);
        System.out.println("PPS entered: " + employee.getPps());

        employeeList.addEmployee(employee);

        System.out.println("\nEmployee added. Details are: ");
        System.out.println("Name: " + employeeList.getAllEmployees().get(0).getName());
        System.out.println("Pps: " + employeeList.getAllEmployees().get(0).getPps());
    }
}
