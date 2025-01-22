//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 


import java.util.*;
public class ProfitandLoss {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profit, loss;
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price: ");
        int sp = sc.nextInt();
        // calculte profit and loss

        if(sp > cp)
        profit = sp - cp;

        else
        loss = cp - sp;

        // profit percentage
        
        double profitPercentage = ((double)profit/cp)*100;
    }
}
