/*
Joel Avery 
CSD 420 Advanced Java Programming
05/26/2023
Module 1 Programming Assignment. 
*/

/*
This code will write a file with two arrays one with a random number of integers
and the other with a random number of double values. It will write them to a file 
called joelAverydatafile.dat, where another program using an inputstream will read
it. For this program it will se a Datastream output and a buffer stream output, 
so it should e set up for best practice. 
*/

import java.io.*; //Importing the java io package.
import java.util.ArrayList; //Importing the array List package. 
import java.lang.Math; //Importing Math Package
import java.text.DecimalFormat; //Importing Decimal Format Package.

public class WriteFile {  
    public static void main(String[] args) throws FileNotFoundException, IOException { //Exceptions that could be thrown. 
        
        //Create an instance of the date 
        java.util.Date date = new java.util.Date(); 
        
        //Create the arrayLists for the double and the integers. 
        ArrayList<Integer> randomInt = new ArrayList<>(); 
        ArrayList<Double> randomDouble = new ArrayList<>(); 
        int temp; 
        
        try(
            //Create an output stream for joelAverydatafile.dat   
            DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("joelAverydatafile.dat", true)))){ 
            output.writeLong(date.getTime()); //Write the time instance in long format
            
            //for loop to randomly add 5 integers between 0-100 including 100 to the randomInt Array List
            for (int i = 0; i < 5; i++){
                temp = (int)(Math.random()*101); 
                randomInt.add(temp);  
            }
            //for loop to go through the array and then add the integers in the the file using the output stream. 
            for (int i = 0; i < randomInt.size(); i++){
                output.writeInt(randomInt.get(i)); 
            }
            
            //Adding an instance of the Decimal Format to make sure that I keep the doubles to two decimal places. 
            DecimalFormat df = new DecimalFormat("#.00"); 
        
            //for loop that adds random numbers 0-100 doubles including 100 to the randomDouble array
            for (int i = 0; i < 5; i++){
              double var = (double)(Math.random() * 101); 
                randomDouble.add(var);
            }
            
            //for loop that goes through the size of the doubles array and parses them and puts them into the df format to make sure they are at 2 decimal places
            //then we write them into the file. 
            for (int i=0; i < randomDouble.size(); i++){
                double roundedValue = Double.parseDouble(df.format(randomDouble.get(i)));
                output.writeDouble(roundedValue); 
            }
            
          
            //In place check to verify if all the data has been written to the file. 
            System.out.println("Data has been written to the file successfully! ");
        }
            
        //Catching exceptions that could occur, and printing the stack trace method if they do occur.     
        catch (IOException ex){
            ex.printStackTrace();
                }
        catch (Exception ex) {
            ex.printStackTrace(); 
        }
    }
}
