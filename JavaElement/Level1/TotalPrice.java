import java.util.*;
public class TotalPrice{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);
        // Created variable to take input of unitprice and quantity
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();

        // Display the output
        System.out.println(" The total purchase price is INR "+(unitPrice * quantity)+" if the quantity is "+ quantity +" and unit price is INR "+ unitPrice);
    }
}


