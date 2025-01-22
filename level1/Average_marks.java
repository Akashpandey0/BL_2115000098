import java.util.*;
public class Average_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics chemistry amd math");
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double math = sc.nextDouble();

        // calculate average
        double average = (physics + chemistry + math) / 3.0;
        System.out.println("Average marks: " + average);
    }
}
