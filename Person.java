
class Person {
    String n;
    int a;

    Person(String n, int a) {
        this.n = n;
        this.a = a;
    }

    Person(Person p) {
        this.n = p.n;
        this.a = p.a;
    }
}
