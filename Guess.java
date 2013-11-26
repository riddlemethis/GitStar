package guess;

//************************************************************
//  Guess.java
//
//  Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        int count = 1;
        int highCount = 0;
        int lowCount = 0;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        numToGuess = generator.nextInt(9) + 1;                                  //randomly generate the number to guess
        
        System.out.println("I want to play a game with you. If you lose, I will destroy you.");
        System.out.println();
        System.out.println("I'm thinking of a number between 1 and 10. What is it?: ");
        guess = scan.nextInt();
        
        while (guess != numToGuess)                                             //keep going as long as the guess is wrong
        {
            System.out.println("This is not my number.");                       //print message saying guess is wrong
            if (guess > numToGuess)
                {System.out.println("Your number is too high");
                highCount++;}
            else
                {System.out.println("Your number is too low");
                lowCount++;}
            
            System.out.println("Guess again... or die: ");                      //get another guess from the user
            guess = scan.nextInt();
            
            count++;
        }
        
        System.out.println("You have guessed correctly. I will allow you to live... for now.");//print message saying guess is right
        System.out.println("Fun fact: it took you " + count + " attempts to guess my gloriously conceived number");
        System.out.println(highCount + " of your attempts were too high");
        System.out.println(lowCount + " of your attempts were too low");
        
        scan.close();
    }
}