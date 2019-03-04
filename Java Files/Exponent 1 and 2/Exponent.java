package exponent;

import java.util.Scanner;
public class Exponent {
    static Scanner sc = new Scanner(System.in);
    public static int Integer, squareNum, cubeNum;
    
    public static void main(String[] args){
        System.out.print("Enter an integer: ");
        Integer = sc.nextInt();
        
        System.out.println("Squared number: " + square(Integer));
        System.out.println("Cubed number: " + cube (Integer));
        tryAgain();
    }
    
    static int square(int Integer){
        squareNum = Integer * Integer;
        return squareNum;
    }
    
    static int cube(int Integer){
        cubeNum = Integer * Integer * Integer;
        return cubeNum;
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