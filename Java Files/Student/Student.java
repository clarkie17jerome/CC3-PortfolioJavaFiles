package student;

import java.util.Scanner;
public class Student {
    
    static Scanner sc = new Scanner(System.in);
    public static String idNum;
    public static char classif;
    public static double creditHours, pointsEarned;
    public static double result;
    
    public static void main(String[] args){
        //ID number
        System.out.print("Enter Student ID Number: ");
        idNum = sc.nextLine();
        
        computeAve(result, pointsEarned, creditHours);
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Student ID Number: " + idNum);
        System.out.println("Earned points by the student: " + pointsEarned);
        System.out.println("Credit hours of the student: " + creditHours);
        System.out.println("Result: " + result);
        
        //classification
        if(result == 3){
            System.out.println("Classification: A");
        } else if (result == 4){
            System.out.println("Classification: B");
        } else if (result <= 5){
            System.out.println("Classification: C");
        }
    }
    
    static double computeAve(double r, double p, double c){
        //points earned
        System.out.print("Enter points earned by the student: ");
        pointsEarned = sc.nextDouble();
        
        //credit hours
        System.out.print("Enter credit hours by the student: ");
        creditHours = sc.nextDouble();
        
        //credit hours, points earned, average
        result = pointsEarned / creditHours;
        return result;
    }
}