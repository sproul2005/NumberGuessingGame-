import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    
    int secretNumber= random.nextInt(100)+1; //Genereate a random number between 1 and 100
    int attempts=0;
    boolean hasGuessed=false;
    
    System.out.println("Welcome to the number guessing game.Guess a number between 1 and 100;");

   while(!hasGuessed){ 
    System.out.println("Enter the Guess Number:");
    int guess = scanner.nextInt();
    attempts++;
    
    if(guess== secretNumber){
        hasGuessed = true;
        System.out.println("Congratulations! you have guessed the correct number in" + attempts + "attempts!");

    }
    else if(guess< secretNumber)
    { 
        System.out.println("Try a Higher number:");
    }
    else {
        System.out.println("Try a Lower number:");
    }
    
}
      scanner.close();

   }    
}
