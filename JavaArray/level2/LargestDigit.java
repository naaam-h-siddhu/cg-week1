import java.util.*;
import java.lang.Math;
public class LargestDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // take the number from the user as input
        int num = sc.nextInt();
        int maxDigit = 10;
        // Create an array to store the digits
        int[] arr = new int[maxDigit];

        int id = 0;

        // Storing the digit inside the Array arr
        while(num >0 ){
            int digit = num%10;
            if(id == maxDigit)
                break;
            arr[id++] = digit;
            num /= 10;
        }
        // Calculating the maximum and minimum value and storing it in int variables 
        int larDigit = -1;
        int secLarDigit = -1;
        for(int it : arr){
            
            if(it > larDigit){
                secLarDigit = larDigit;
                larDigit = it;
            }
            else if(it>secLarDigit && it != larDigit){
                secLarDigit = Math.max(secLarDigit, it);
            }


        }
        //Output
        System.out.println("The largest digit is "+larDigit+" and the second largest is "+secLarDigit);
    }
}

    




