class Employee {
    String name;
    int age;
    Double salary;

    public Employee(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Double getSalary() {
        return salary;
    }

    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, Double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary + " Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int age, Double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary + " Programming Language: " + programmingLanguage);
    }
}

public class EmployeeMangementSystem {

    public static void main(String[] args) {
        Employee employee = new Employee("Generic Employee", 25, 50000.0);
        employee.showDetails();

        Manager manager = new Manager("Manager", 30, 100000.0, 10);
        manager.showDetails();

        Developer developer = new Developer("Developer", 25, 80000.0, "Java");
        developer.showDetails();
    }
}