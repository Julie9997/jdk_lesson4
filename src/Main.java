import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();

        // добавление в справочник
        directory.addEmployee(123, "1234567890", "Иван", 5);
        directory.addEmployee(124, "1234567896", "Иван", 2);
        directory.addEmployee(456, "0987654321", "Дарья", 2);
        directory.addEmployee(835, "1357924680", "Сергей", 2);
        directory.addEmployee(463, "1357924680", "Александр", 3);

        // плиск по количеству опыта
        List<Employee> employeesWith2YearsExp = directory.searchByExperience(2);
        System.out.println("Сотрудники со стажем 2 года:");
        for (Employee employee : employeesWith2YearsExp) {
            System.out.println(employee);
        }
        System.out.println();

        // поиск телефонов по имени
        List<String> phoneNumbersForIvan = directory.searchPhoneNumberByName("Иван");
        System.out.println("Телефоны всех Иванов:");
        for (String phoneNumber : phoneNumbersForIvan) {
            System.out.println(phoneNumber);
        }
        System.out.println();

        // поиск сотрудника по номеру
        Employee employeeWithEmpNumber = directory.searchByEmployeeNumber(456);
        if (employeeWithEmpNumber != null) {
            System.out.println(employeeWithEmpNumber);
        } else {
            System.out.println("Такого сотрудника нет");
        }
    }
}
