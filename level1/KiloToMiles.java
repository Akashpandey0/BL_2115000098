import java.util.*;
public class KiloToMiles {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Kilometers");
        double kilo = sc.nextDouble();
        double miles = kilo * 0.621371;
        System.out.println(kilo + " Kilometers is equal to " + miles + " Miles");
    }
}
