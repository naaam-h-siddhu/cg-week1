public class StudentFee{
    public static void main(String[] args){
        // Created a int variable to store the fee and assigned 125000
        int fee = 125000;

        // Created a int variable to store the discount % and assigned 10
        int discount = 10;
        // Created a double variable to store the discout amount
        double discountAmount = (double)fee / discount;
        // Created a double variable to store the discounted Fee
        double discountedFee = (double)fee - discountAmount;
        // Output the result
        System.out.println("The discount amount is INR "+discountAmount +" and final discounted fee is INR "+ discountedFee);
    }
}

