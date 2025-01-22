//Write a program that takes your height in centimeters and converts it into feet and inches

import java.util.*;
public class Height_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in centimeters: ");
        int height_cm = scanner.nextInt();
        double height_feet = (double) height_cm / 30.48;
        double height_inches = (double) height_cm / 2.54;
        System.out.println(height_cm + " centimeters is equal to " + height_feet + "feet");
        System.out.println(height_feet+"convert into inches"+height_inches+"inches");
    }
}
