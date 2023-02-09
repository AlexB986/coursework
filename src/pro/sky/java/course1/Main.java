package pro.sky.java.course1;



public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Иван", "Иванович", "Иванов", 1, 12345);
        employees[1] = new Employee("Петя", "Петрович", "Петрович", 2, 12705);
        employees[2] = new Employee("Максим", "Максимович", "Максимыч", 2, 13845);
        employees[3] = new Employee("Катя", "Александровна", "Кукущкина", 1, 14000);
        employees[4] = new Employee("Лена", "Игоревна", "Ежова", 3, 12500);
        employees[5] = new Employee("Рома", "Евгеньевич", "Ростаргуев", 4, 20000);
        employees[6] = new Employee("Аня", "Павловна", "Куклачева", 4, 119000);
        employees[7] = new Employee("Коля", "Леонидович", "Романов", 3, 16400);
        employees[8] = new Employee("Михаил", "Максимович", "Агафонов", 5, 14320);
        employees[9] = new Employee("Дима", "Петрович", "Якубович", 5, 16589);
        Person person = new Person(employees);

        System.out.println(person.toString());
        System.out.println("Сумма зарплата " + Person.printSum(employees));
        System.out.println("Max зарплата " + Person.printMaxSalary(employees));
        System.out.println("Min зарплата " + Person.printMinSalary(employees, Person.printMaxSalary(employees)));
        System.out.println("Средняя зарплата " + Person.printPersonMidellSalary(Employee.counter, Person.printSum(employees)));
        Person.printNameEmployees(employees);

        System.out.println("______midell level________");

        float percent = 15;
        Person.printIndexingSalary(employees, percent);
        System.out.println("Отдела отрудника с максимальной зарплатой " + Person.printDepartment(employees, Person.printMaxSalary(employees)));
        System.out.println("Отдела отрудника с минимальной зарплатой " + Person.printDepartment(employees, Person.printMinSalary(employees, Person.printMaxSalary(employees))));
        Person.totalSalaryDepart(employees, Person.getNumberDepartaments(employees));
        System.out.println("---------------------------------");
        Person.middelSalaryEmployee(employees, Person.getNumberDepartaments(employees));
        Person.printIndexingSalaryDepart(employees, percent, 2);
        Person.allPersonDepartament(employees, 1);
        Person.allPersonMinSalary(employees, 15000);
        System.out.println("---------------------------------");
        Person.allPersonMaxSalary(employees, 15000);

    }

}


