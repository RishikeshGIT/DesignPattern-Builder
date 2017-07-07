package designpatterns.builder;

/**
 * Created by kumarris on 28/01/17.
 */
public class EmployeeBuilder {

    private final String firstName;
    private final String lastName;
    private int age;
    private String maritalStatus;
    private String department;
    private long salary;

    public EmployeeBuilder (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeBuilder age(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder maritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public EmployeeBuilder department(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder salary(long salary) {
        this.salary = salary;
        return this;
    }

    public Employee buildEmployee() {
        Employee employee = new Employee(this);
        return employee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }
}
