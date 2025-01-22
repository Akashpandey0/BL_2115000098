import java.util.*;
public class PriceOfItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of item: ");
        int unitPrice = sc.nextInt();

        // Quantity of an item

        int quantity = sc.nextInt();
        int total = unitPrice * quantity;
        System.out.println("Total price of item is: " + total);
    }    
}
