package salary;

import java.util.Scanner;
public class Salary {
    static Scanner sc = new Scanner(System.in);
    public static double hourlyPay, regHours, overtimeHours, overtimePay;
    public static double multiplier = 1.5;
    
    public static void main(String[] args) {
        System.out.print("Enter hourly pay rate: P");
        hourlyPay = sc.nextDouble();
        
        System.out.print("Enter regular hour(s): ");
        regHours = sc.nextDouble();
        
        System.out.print("Enter overtime hours: ");
        overtimeHours = sc.nextDouble();
        
        overtimePay();
        System.out.println("Your overtime pay is: " + overtimePay);
        tryAgain();
    }   
    
    public static void overtimePay(){
        overtimePay = regHours * hourlyPay * overtimeHours * multiplier;
    }
    
    public static void tryAgain(){
         //try again prompt for user convenience
        String choice;
        System.out.print("DO YOU WANT TO TRY AGAIN? [Y/N]: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        
        if (choice.equals("Y") || (choice.equals("y"))){
            System.out.println("\n");
            //call or go back to the main method
            main(new String[]{});
        } else if (choice.equals("N") || (choice.equals("n"))){
            System.out.println("Goodbye.");
            System.exit((0));
        } else {
            System.err.println("INVALID INPUT.");
            tryAgain();
        }
        System.out.println();
    }
}