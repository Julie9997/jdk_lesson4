import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private final List<Employee> employeesList = new ArrayList<>();

    public void addEmployee(int employeeNumber, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeNumber, phoneNumber, name, experience);
        employeesList.add(newEmployee);
    }
    public List<Employee> searchByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp: employeesList) {
            if (emp.getExperience() == experience)
                result.add(emp);
        }
        return result;
    }

    public List<String> searchPhoneNumberByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee emp: employeesList) {
            if (emp.getName().equals(name))
                result.add(emp.getPhoneNumber());
        }
        return result;
    }

    public Employee searchByEmployeeNumber(int empNumber) {
        for (Employee emp: employeesList) {
            if (emp.getEmployeeNumber() == empNumber) {
                return emp;
            }
        }
        return null;
    }

}
