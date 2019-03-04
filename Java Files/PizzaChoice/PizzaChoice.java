package pizzachoice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class PizzaChoice {
    public static void main(String[] args){
        
        //create a jframe and panel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        //user input for pizza size and printing
        String sizeChoice;     
        sizeChoice = JOptionPane.showInputDialog(null, "ENTER PIZZA SIZE [S, M, L, X]");
        if(sizeChoice.equals("S") || (sizeChoice.equals("s"))){
            JOptionPane.showMessageDialog(frame, "The price of a SMALL pizza is $6.99.");
        } else if(sizeChoice.equals("M") || (sizeChoice.equals("m"))){
            JOptionPane.showMessageDialog(frame, "The price of a MEDIUM pizza is $8.99.");
        } else if(sizeChoice.equals("L") || (sizeChoice.equals("l"))){
            JOptionPane.showMessageDialog(frame, "The price of a LARGE pizza is $12.50.");
        } else if(sizeChoice.equals("X") || (sizeChoice.equals("x"))){
            JOptionPane.showMessageDialog(frame, "The price of an EXTRA LARGE pizza is $15.00.");
        } else {
            JOptionPane.showMessageDialog(panel, "INVALID INPUT.", "Error", JOptionPane.ERROR_MESSAGE);
            main(new String[]{});
        }
        tryAgain();
    }
         
    private static void tryAgain(){
        //create a jframe and panel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        //yes or no input
        String choice;
        choice = JOptionPane.showInputDialog(null, "DO YOU WANT TO TRY AGAIN? [Y/N]");        
        if(choice.equals("Y") || (choice.equals("y"))){
            //call or go back to the main method
            main(new String[]{});
        } else if (choice.equals("N") || (choice.equals("n"))){
            JOptionPane.showMessageDialog(frame, "HAVE A NICE DAY!");
            System.exit((0));
        } else {
            JOptionPane.showMessageDialog(panel, "INVALID INPUT.", "Error", JOptionPane.ERROR_MESSAGE);
            tryAgain();
        }
        System.out.println();
    }
}