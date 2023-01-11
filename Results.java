/*Joel Avery 
   CSD 320-3030
   Programming with Java
   1/2/23
This class will display the two different results and mention which ouuput
is better and why

*/
public class Results {
    /** This class will output the results of two displays */
    public static void main(String[] args) {
        //Prints the results of the floats
        System.out.println(4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 /
                9.0 - 1.0 / 11.0 + 1.0 / 13.0  ));
        
        //Prints the results of the integers
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 
                / 13));
        
        /* Obviously you would have to clean the formatting up, and adjust the 
           amount of decimals that you would want to see, but I would say the 
           better way when you are trying to do mathematics in java would be to 
           use the floats, because java goes off of the numerator and truncates
           the denominator. I would say this should be the way we handle the 
           format just because the answer becomes incorect. */
    }
    
}
