/*
Joel Avery 
CSD 420 Advanced Java Programming
05/26/2023
Module 1 Programming Assignment. 
*/

/*
This code will create a DataInput Stream using a Buffered Input stream and read
the file joelAverydatafile.dat, it will read and show a list of both arrays in the 
file, and output cleanly the five integers and five doubles. 
*/

import java.io.*; //importing the java.io 
import java.util.ArrayList; //importing java.util.ArrayList Package

public class ReadFile {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("joelAverydatafile.dat")))) { //creating a new buffered input stream for reading. 
            long dateValue = input.readLong(); //read the date as it was input as a long. 
            System.out.println("The date and time this file was created is: " + new java.util.Date(dateValue)); //printing out the time the file was created. 
            System.out.println(); //spacer to make output more cleaner. 

            ArrayList<Integer> randomInt = new ArrayList<>(); //array lists again. 
            ArrayList<Double> randomDouble = new ArrayList<>(); //array lists again

            //Printing out the numbers for both arrays with spacers in to help output be cleaner. 
            System.out.println("The integer numbers stored in the file are:");
            for (int i = 0; i < 5; i++) {
                int number = input.readInt();
                System.out.println(number);
                randomInt.add(number);
            }
            System.out.println(); 

            System.out.println("The double numbers stored in the file are:");
            for (int i = 0; i < 5; i++) {
                double number = input.readDouble();
                System.out.println(number);
                randomDouble.add(number);
            }
          //Catching any IO Exceptions.   
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
