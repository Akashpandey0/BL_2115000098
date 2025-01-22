//Create a program to find the maximum number of handshakes among N number of students.
import java.util.*;
public class MaxHandshakes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxHandshakes = n * (n - 1) / 2;
        System.out.println(maxHandshakes);
    }
}
