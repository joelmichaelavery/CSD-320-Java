

/**
 Joel Avery
 CSD 320
 Module 2 Programming Assignment
 01/10/2023
 */

/*
This program takes input from the user in water mass in kg, initial temperature
and final temperature. From here, it converts the amount of energy in Joules
that it takes to heat the water from the initial temperature to the final 
temperature.
*/

//import the scanner class
import java.util.Scanner; 

public class EnergyToHeatWater {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in); 
        
        //Ask for input for water mass in kg. Store variable
        System.out.print("Enter the amount of water in kg: ");
        double waterMass = input.nextDouble(); 
        
        //Ask for input for final temperature in celsius
        System.out.print("Enter the target final temperature in celsius: ");
        double finalTemperature = input.nextDouble(); 
        
        //Ask for the initial temperature in celsius
        System.out.print("Enter the initial temperature in celsius: "); 
        double initalTemperature = input.nextDouble(); 
        
        //Formula to convert the amount of Joules it takes to convert the temp
        double Q = waterMass * (finalTemperature - initalTemperature) * 4184;
        
        //Display the amount of energy in Joules it takes to convert the temp
        System.out.print("The amount of energy to convert " + waterMass + "kg "
                + "of water to " + finalTemperature + "°C from " + 
                initalTemperature + "°C is " + Q + " Joules!");
       
        
        
        
    }
    
}
