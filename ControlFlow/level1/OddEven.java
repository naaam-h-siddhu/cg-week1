import java.util.*;
public class OddEven{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if(i%2 == 0)
                System.out.println(i+" is Even");
            else
                System.out.println(i+" is Odd");
        
        }

    }
}




