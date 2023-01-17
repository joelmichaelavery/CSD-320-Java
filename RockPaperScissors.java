import java.util.Scanner; 
/*
 Joel Avery 
Module 3 Assignment 
01/16/2023
CSD 320
 */

/*This Program has the computer playing the user, the computer picks a number 
randomly 1,2, or 3 for rock paper or scissors, then the user is asked for an input
and from here the results are compared and the output shows who is the winner.*/

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create an instance of Scanner
        int num1 = (int)(Math.random()*3 + 1); //Generates a random number 0-3
        //Get input from user on selecting 1,2, or 3
        System.out.print("Select 1 for rock, 2 for paper or 3 for scissors: "); 
        int num2 = input.nextInt(); 
        
        //Begins switch statement to determine winner based on selections
        switch (num1){
            case 1: 
                if (num2 == 3){ // Rock beats paper
                    System.out.print("Computer Selected Rock, You Selected "
                    + "Scissors, Computer Wins Rock beats Scissors"); 
                }
                else if (num2 == 2){//Paper beats Rock
                    System.out.print("Computer Selected Rock, You Selected " 
                    + "Paper, You Win Paper beats Rock"); 
                }
                else if (num2 == 1){//Tie game
                    System.out.print("Computer Selected Rock, You Selected "
                    + "Rock, The game is a tie. "); 
                }
                    
                break; //breaks the case statement
                  
                
            case 2: 
                if (num2 == 1){//Paper beats Rock
                    System.out.print("Computer Selected Paper, You Selected "
                    + "Rock, Computer Wins! Paper beats Rock"); 
                }
                else if (num2 == 2){//Tie game
                    System.out.print("Computer Selected Paper, You Selected "
                    + "Paper, the game is a tie!"); 
                }
                else if (num2 == 3){//Scissors beats paper
                    System.out.print("Computer Selected Paper, You Selected "
                    + "Scissors, You Win Scissors beats Paper!"); 
                }
                break; //Statement that breaks the case
            
            case 3:
                if (num2 == 1){//Rock beats scissors
                    System.out.print("Computer Selected Scissors, You Selected "
                    + "Rock, You Win Rock beats Scissors!");
                }
                else if (num2 == 2){//Scissors beats papers
                    System.out.print("Computer Selected Scissors, You Selected "
                    + "Paper, Computer Wins, Scissors beats Paper!"); 
                }
                else if (num2 == 3){//Tie Game
                    System.out.print("Computer Selected Scissors, You Selected "
                            + "Scissors, the game is a tie. ");
                }
                break;//Statement breaks the case
        
        }
    }
    
    
}
