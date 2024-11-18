// Matthew Fiore
// CSA 4A
// 11/14
// Coin Flipper Data Basics Game


import java.util.Scanner; 
import java.util.Random;

public class MyProgram
{
    public static void main(String[] args)
    {
        
        
    boolean playagain=true;
    int wins=0;
    int losses=0;
    int games=0;
    double winpercent=0.0;
    int computerchoice=0;
    String playerchoice="none";
    String flipresult="HEADS";
    String again="No";
    Random rand = new Random();
    Scanner scanner1 = new Scanner(System.in);
    
    
    System.out.println("Coin Flipper Game!");
    
    while(playagain)
    {
        
        
        computerchoice = rand.nextInt((1 - 0) + 1); 
        if (computerchoice==0){
            flipresult="TAILS";
        }
        else if (computerchoice==1){
            flipresult="HEADS";
        }
        // Chooses either heads or tails with random number generator
        
        System.out.println("Enter heads or tails: ");
        playerchoice=scanner1.nextLine();
        playerchoice=playerchoice.toUpperCase();
        // gets and prepares user choice to be compared to the computer choice
        
        System.out.println("The result is " + flipresult + ". ");
        
        if (playerchoice.equals(flipresult)) {
            System.out.println("\u001B[32mYou Win!\u001B[30m");
            wins++;
            games++;
        }
        else{
            System.out.println("\u001B[31mYou Lose!\u001B[30m");
            losses++;
            games++;
        }
        // Calcualtes if the player chose correctly and increments necessary counters
        
        System.out.println("Enter 'y' in order to play again. ");
        again=scanner1.nextLine();
        if (again.equalsIgnoreCase("y")){
            playagain=true;
            System.out.print("\033[H\033[2J"); System.out.flush(); 
        }
        else {
            playagain=false;
            System.out.print("\033[H\033[2J"); System.out.flush(); 
    }
    // determines if the player wants to play again which will restart the loop
    }
System.out.println("Game Over! ");
winpercent=(wins*100)/games;
System.out.println("Stats: \nWins " + wins + "\nLosses " + losses + "\nWin Rate %" + winpercent + ".");
// calculates win rate and prints the players stats at the end of the game
    
    scanner1.close();
    
    
    }
}
