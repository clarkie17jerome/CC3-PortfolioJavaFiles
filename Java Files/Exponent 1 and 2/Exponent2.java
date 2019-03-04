package exponent;

import java.util.Scanner;
public class Exponent2 {
    static Scanner sc = new Scanner(System.in);
    public static int Integer, squareNum, cubeNum, multiNum;
    
    public static void main(String[] args){
        System.out.print("Enter an integer: ");
        Integer = sc.nextInt();
        
        square();
        cube();
        tryAgain();
    }
    
    public static void square(){
        squareNum = Integer * Integer;
        System.out.println("Squared number: " + squareNum);
        
        multiNum = cubeNum * squareNum;
        System.out.println("Multiplied number: " + multiNum);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        
    }
    
    public static void cube(){
        cubeNum = Integer * Integer * Integer;
        System.out.println("Cubed number: " + cubeNum);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        square();
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