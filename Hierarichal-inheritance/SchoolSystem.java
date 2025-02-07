class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Mr. Smith", 35, "Mathematics");
        Student john = new Student("John Doe", 16, 10);
        Staff adminStaff = new Staff("Ms. Johnson", 40, "Administration");

        mathTeacher.displayRole();
        mathTeacher.displayPersonInfo();
        System.out.println("--------------------");

        john.displayRole();
        john.displayPersonInfo();
        System.out.println("--------------------");

        adminStaff.displayRole();
        adminStaff.displayPersonInfo();
        System.out.println("--------------------");


        //Polymorphism Example
        Person myPerson;

        myPerson = mathTeacher;
        myPerson.displayPersonInfo();
        System.out.println("--------------------");

        myPerson = john;
        myPerson.displayPersonInfo();
        System.out.println("--------------------");

        myPerson = adminStaff;
        myPerson.displayPersonInfo();
        System.out.println("--------------------");

    }
}