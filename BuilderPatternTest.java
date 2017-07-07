package designpatterns.builder;

/**
 * Created by kumarris on 28/01/17.
 */
public class BuilderPatternTest {

    public static void main(String[] args) {
        Employee employee1 = new EmployeeBuilder("Ram", "Narayan")
                .age(24)
                .department("RnD")
                .maritalStatus("Single")
                .salary(1600000)
                .buildEmployee();

        System.out.println(employee1);

        Employee employee2 = new EmployeeBuilder("Radhey", "Shyam")
                .age(26)
                .department("Prod Development")
                .buildEmployee();
        System.out.println(employee2);
    }

}
