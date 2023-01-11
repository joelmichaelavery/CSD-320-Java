import java.util.Scanner; //Scanner is in the java.util package
public class ComputeAverage {

    public static void main(String[] args) {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in); 
        
        //Prompt User to enter Three numbers. 
        System.out.print("Enter Three Numbers: "); 
        double number1 = input.nextDouble(); 
        double number2 = input.nextDouble(); 
        double number3 = input.nextDouble(); 
        
        //compute Average
        double average = (number1 + number2 + number3) / 3; 
        
        //Display results
        System.out.println("The average of " + number1 + " " + number2 
        + " " + number3 + " is " + average); 
    }
    
}
