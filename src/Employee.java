public class Employee {
    private int employeeNumber;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int employeeNumber, String phoneNumber, String name, int experience) {
        this.employeeNumber = employeeNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "номер сотрудника = " + employeeNumber +
                ", номер телефона = " + phoneNumber +
                ", имя = " + name +
                ", опыт = " + experience;
    }
}
