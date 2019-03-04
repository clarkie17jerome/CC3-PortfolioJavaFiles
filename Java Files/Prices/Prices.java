package prices;

import java.util.Scanner;
import java.util.stream.IntStream;
public class Prices{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter number of elements: ");
        int numOfElem = (int) sc.nextDouble();
        int [] array = new int[numOfElem];
        System.out.println("------------------------");
        
        System.out.print("Enter elements: ");
        for(int i = 0; i < numOfElem; i++){
            array[i] = (int) sc.nextDouble();
        }
        System.out.println("------------------------");
        
        //sum of all listed prices
        double sum = IntStream.of(array).sum();
        System.out.println("The SUM of all listed prices: " + sum);        
        System.out.println("------------------------");
        
        //values less than $5.00
        for(int x = 0; x < numOfElem; x++){
            if(array[x] < 5){
                System.out.println("Prices lower than $5.00: " + array[x]);
                System.out.println("------------------------");
            }
        }
        
        //average of all values
        double average = sum/numOfElem;
        System.out.println("The AVERAGE of all listed prices: " + average);
        System.out.println("------------------------");
        
        //prices higher than calculated average
        for(int x = 0; x < numOfElem; x++){
            if(array[x] > average){
                System.out.println("Prices higher than calculated average: " + array[x]);
                System.out.println("------------------------");
            }
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