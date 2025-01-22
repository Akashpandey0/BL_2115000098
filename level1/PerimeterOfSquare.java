import java.util.*;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        // calculate the perimeter of square
        int perimeter = 4 * side;
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}
