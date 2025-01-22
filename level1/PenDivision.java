import java.util.*;
public class PenDivision {
    public static void main(String[] args) {
        System.out.println("Enter total pens");
        int totalPens = 14;

        System.out.println("Enter total students");
        int totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Printing the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
