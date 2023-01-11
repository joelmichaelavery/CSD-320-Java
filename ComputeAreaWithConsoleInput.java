import java.util.Scanner; //Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a radius
        System.out.print("Enter a number for the radius: ");
        double radius = input.nextDouble();
        
        //Compute Area
        double area = radius * radius * 3.14159; 
        
        //Display results
        System.out.println("The area for the circle with a radius of " + radius +
                " is " + area);
        
    }
    
}
