import java.util.*;
public class StudentFeeV2{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created a int variable to store the fee and assigned 125000
        int fee = sc.nextInt();

        // Created a int variable to store the discount % and assigned 10
        int discount = sc.nextInt();
        // Created a double variable to store the discout amount
        double discountAmount = (double)fee / discount;
        // Created a double variable to store the discounted Fee
        double discountedFee = (double)fee - discountAmount;
        // Output the result
        System.out.println("The discount amount is INR "+discountAmount +" and final discounted fee is INR "+ discountedFee);
    }
}


