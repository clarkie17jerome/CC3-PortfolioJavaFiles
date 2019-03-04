package intarray;

import java.util.Scanner;
public class IntArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int [] array = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i : array){
            System.out.println("Values FIRST to LAST order: " + i);
        }
        
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println("Values LAST to FIRST order: " + array[i]);
        }
        
        tryAgain();
    }
    
    public static void tryAgain(){
        String choice;
        System.out.print("DO YOU WANT TO TRY AGAIN? [Y/N]: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        
        if(choice.equals("Y") || (choice.equals("y"))){
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