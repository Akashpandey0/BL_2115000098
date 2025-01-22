//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

import java.util.*;
public class CalculateAge{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current year: ");
        int current_year = sc.nextInt();

        System.out.print("Enter birth year: ");
        int birth_year = sc.nextInt();

        // calculate age of the person
        int age = current_year - birth_year;
        System.out.println("The age of the person: "+age);
    }
}