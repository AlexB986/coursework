package pro.sky.java.course1;



import java.util.Arrays;
import java.util.Objects;

public class Person {
    private Employee[] employees;


    public Person(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    //* суммa затрат на зарплаты в месяц.
    public static int printSum(Employee[] employees) {
        int sum = 0;
        String emplouee = employees[1].getLastName();
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    //* максимальной зарплатой
    public static int printMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    //* сотрудник с min и max зп
    public static String printPersonMaxMinSalary(Employee[] employees, int salary) {
        String maxEmployee = new String();

        for (int i = 0; i < employees.length; i++) {
            if (salary == employees[i].getSalary()) {
                maxEmployee = employees[i].getLastName();

            }
        }
        return maxEmployee;
    }

    //* минимальной зарплатой.
    public static int printMinSalary(Employee[] employees, int maxSalary) {
        int minSalary = maxSalary;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    //*Подсчитать среднее значение зарплат (можно использовать для этого метод
    public static int printPersonMidellSalary(int counter, int sumSalary) {
        int allCounter = counter;
        int totalSalary = sumSalary / allCounter;
        return totalSalary;
    }

    //*Получить Ф. И. О. всех сотрудников (вывести в консоль)
    public static void printNameEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Имя " + employees[i].getFirstName() +
                    " Отчество " + employees[i].getMiddelName() +
                    " Фамилия " + employees[i].getLastName());

        }
    }

    //* midell level
    // индексировать зарплату вызвать изменение зарплат у всех сотрудников
    public static void printIndexingSalary(Employee[] employees, float percent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * (percent / 100) + employees[i].getSalary()));
            System.out.println("Индексация " + employees[i].getLastName() + " " + employees[i].getSalary());
        }
    }

    //* индексировать зарплату всех сотрудников отдела на процент
    public static void printIndexingSalaryDepart(Employee[] employees, float percent, int departament) {
        float indexing = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament()) {
                indexing = employees[i].getSalary() * (percent / 100) + employees[i].getSalary();
                System.out.println("Индексация " + employees[i].getLastName() + " департамент " + employees[i].getDepartament() + " " + employees[i].getSalary());
            }
        }
    }

    //* Сотрудника с минимальной зарплатой. с максимальной зарплатой
    public static int printDepartment(Employee[] employees, int salary) {
        int departament = 0;
        for (int i = 0; i < employees.length; i++) {
            if (salary == employees[i].getSalary()) {
                departament = employees[i].getDepartament();
            }
        }
        return departament;
    }

    //* кол-во депортаментов(5)
    public static int getNumberDepartaments(Employee[] employees) {
        int maxNumberDepartament = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxNumberDepartament < employees[i].getDepartament()) {
                maxNumberDepartament = employees[i].getDepartament();
            }
        }
        return maxNumberDepartament;
    }

    //* Сумму затрат на зарплату по отделу.
    public static void totalSalaryDepart(Employee[] employees, int departaments) {
        int totalSalary = 0;
        for (int i = 1; i <= departaments; i++) {
            int numberDepart = i;
            int count = 0;
            for (int j = 0; j < employees.length; j++) {
                if (i == employees[j].getDepartament()) {
                    totalSalary += employees[j].getSalary();
                    count++;
                } else if (j == employees.length) {
                    count--;

                }
            }
            System.out.println("Сумма по депортаменту  " + i + " - " + totalSalary);
        }

    }

    //* Среднюю зарплату по отделу
    public static void middelSalaryEmployee(Employee[] employees, int departaments) {

        int totalSalary = 0;
        for (int i = 1; i <= departaments; i++) {
            int numberDepart = i;
            int count = 0;
            for (int j = 0; j < employees.length; j++) {
                if (i == employees[j].getDepartament()) {
                    totalSalary += employees[j].getSalary();
                    count++;
                } else if (j == employees.length) {
                    count--;

                }
            }
            int middel = totalSalary / count;
            System.out.println("Средняя по депортаменту  " + i + " - " + middel);
        }
    }
    //*Напечатать всех сотрудников отдела все данные, кроме отдела

    public static void allPersonDepartament(Employee[] employees, int departament) {
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament()) {
                System.out.println("Фамилия " + employees[i].getFirstName() + " Имя " + employees[i].getMiddelName() + " Отчество " + employees[i].getLastName() + " Зарплата " + employees[i].getSalary());
            }
        }
    }

    //* Получить в качестве параметра число и найти: Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой
    public static void allPersonMinSalary(Employee[] employees, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (salary > employees[i].getSalary()) {
                System.out.println("Зарплата меньше " + salary + " Фамилия " + employees[i].getFirstName() + " Имя " + employees[i].getMiddelName() + " Отчество " + employees[i].getLastName() + " Зарплата " + employees[i].getSalary());
            }
        }
    }

    //* зарплатой больше или равно
    public static void allPersonMaxSalary(Employee[] employees, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (salary <= employees[i].getSalary()) {
                System.out.println("Зарплата больше " + salary + " Фамилия " + employees[i].getFirstName() + " Имя " + employees[i].getMiddelName() + " Отчество " + employees[i].getLastName() + " Зарплата " + employees[i].getSalary());
            }
        }
    }

    @Override
    public String toString() {

        return "Person{" + "employees=" + Arrays.toString(employees) + '}';
    }
}



