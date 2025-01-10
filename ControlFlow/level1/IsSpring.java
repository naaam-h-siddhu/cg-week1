import java.util.*;
public class IsSpring{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take the input of month and date
        int month = sc.nextInt();
        int day = sc.nextInt();
        // March = 3 June = 6
        boolean flag  = false;
        if(month == 3 && day >=20)
            flag = true;
        if(month > 3 && month < 6)
            flag = true;
        if(month == 6 && day <= 20)
            flag = true;
        if(flag)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

