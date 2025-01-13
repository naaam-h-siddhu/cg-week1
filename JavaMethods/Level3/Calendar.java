import java.util.Scanner;

public class Calendar {
    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };
    public static boolean isLeapYear(int year){
        if(year % 4 == 0) {
            if(year % 100 == 0)
                return year % 400 == 0;
            return true;
        }
        return false;
    }
    public static int[] getDaysInMonth(int[]){

        
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();



    }



}
