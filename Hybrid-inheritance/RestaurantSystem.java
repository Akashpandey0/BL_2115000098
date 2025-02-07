interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + specialization + " dishes.");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Specialization: " + specialization);
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Gordon Ramsay", 101, "Italian");
        Waiter waiter1 = new Waiter("Maria", 201, 5);

        chef1.displayPersonInfo();
        chef1.performDuties();
        System.out.println("--------------------");

        waiter1.displayPersonInfo();
        waiter1.performDuties();
        System.out.println("--------------------");

        //Polymorphism with Interface
        Worker myWorker;

        myWorker = chef1;
        myWorker.performDuties();
        System.out.println("--------------------");

        myWorker = waiter1;
        myWorker.performDuties();
        System.out.println("--------------------");

        Person myPerson;

        myPerson = chef1;
        myPerson.displayPersonInfo();
        System.out.println("--------------------");

        myPerson = waiter1;
        myPerson.displayPersonInfo();
        System.out.println("--------------------");

    }
}