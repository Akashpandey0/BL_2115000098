import java.util.*;
public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // university fee
        int fee = sc.nextInt();

        // discount percent
        int discount = sc.nextInt();

        // total discount
        int totalDiscount = (fee * discount) / 100;

        //discounted price
        int discountedPrice = fee - totalDiscount;
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
