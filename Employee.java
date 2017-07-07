package designpatterns.builder;

import designpatterns.builder.EmployeeBuilder;
/**
 * Created by kumarris on 27/01/17.
 */
public class Employee {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String maritalStatus;
    private final String department;
    private final long salary;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.getFirstName();
        this.lastName = employeeBuilder.getLastName();
        this.age = employeeBuilder.getAge();
        this.maritalStatus = employeeBuilder.getMaritalStatus();
        this.department = employeeBuilder.getDepartment();
        this.salary = employeeBuilder.getSalary();
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

    @Override
    public String toString() {
        return "Employee details: "+ this.getFirstName()+", "+this.getLastName()+"; "+this.getAge()+" years old; "
                +this.getMaritalStatus()+"; "+this.getDepartment()+"; "+ this.getSalary();
    }

}
