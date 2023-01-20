package pro.sky.java.course1;



import java.util.Objects;

public class Employee {
    public Person person;
    private String firstName;
    private String middelName;
    private String lastName;
    private int departament;
    private int salary;
    public static int counter = 0;
    private int id;


    public Employee(String firstName, String middelName, String lastName, int departament, int salary) {
        this.firstName = firstName;
        this.middelName = middelName;
        this.lastName = lastName;
        this.departament = departament;
        this.salary = salary;
        id = counter++;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddelName() {
        return this.middelName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartament() {
        return this.departament;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +

                ", firstNameAuthor='" + firstName + '\'' +
                ", middelName='" + middelName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(middelName, employee.middelName) && Objects.equals(lastName, employee.lastName) && Objects.equals(departament, employee.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middelName, lastName, departament, salary);
    }
}

