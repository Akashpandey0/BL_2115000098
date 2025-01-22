import java.lang.Math;
import java.util.*;
public class Earth_volume_Calculation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Earth in kilometers: ");
        double radius = sc.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius
        , 3.0);
        System.out.println("The volume of the Earth is: " + volume + " cubic kilometers");
    }
}
