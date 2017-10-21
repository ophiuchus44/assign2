import java.util.*;
import java.io.*;
import java.lang.*;

public class assign2b{
	

public static void main (String [] args){
	
	Scanner inScan = new Scanner(System.in);

	System.out.println("Welcome to the Scrambler!");

	System.out.print("What is your name? ");

	// when saving different users/ need a remember me place and create new account section here
	String userName = inScan.nextLine();

	// if username matches list bonus stuff//
	String file = "swamp.txt";

	// results file will concate with userName
	String fileResults = "results.txt";


	//boolean gameOver = false;
	boolean nextWord = true;
	//int guessCount = 3;

	Scramble theScramble = new Scramble(file);

	Results results = new Results(fileResults);


	while(nextWord){
		boolean gameOver = false;

		int guessCount = 3;

	//	Scramble theScramble = new Scramble(file);
	// grab a word from txt
		String word = theScramble.getRealWord();

// if file empty returns a null value for word and will exit
		if(word == null){
			nextWord = false;
			gameOver = true;
		}
	// grab scrambledword from class
		String wordScrambled = theScramble.getScrambledWord();
	
	// initialize guess constructor so it knows the word and scrambledword
		Guess guess = new Guess(word, wordScrambled);


		System.out.println(userName + ", you have 3 guesses to get the Scramble");
			System.out.println("Good luck!");

		while(!gameOver){
	
			//int guessCount = 3;

			//System.out.println(userName + ", you have 3 guesses to get the Scramble");
			//System.out.println("Good luck!");
			System.out.println("You have " + guessCount + " guesses remaining");
			System.out.println("Scrambled Word: " + wordScrambled.toUpperCase());	
			System.out.print("Your guess: ");
			String userGuesses = inScan.nextLine();
			
			// make sure guess is proper length
//			while(userGuesses.length()>word.length()){
//				System.out.println("You guesssed too many letters");
//				System.out.print("Guess again: ");		
//				userGuesses = inScan.nextLine();
//				}

			String isRight = guess.userGuess(userGuesses);

			if(isRight.toLowerCase().equals(word)){
				System.out.println("Great job " + userName + "! You got it!");
				// add to results won counter
				results.won();
				gameOver = true;
			}
			else{
				System.out.println("Sorry, " + userName + " that is not correct");
				System.out.println("Here are the letters you got correct");
				System.out.println(isRight.toLowerCase());	
				guessCount--;
			}
			//gameOver = false;	
			if (guessCount==0){
				System.out.println("You have " + guessCount + " guesses remaining");
				System.out.println("Round over! Better luck next time " + userName);
				System.out.println("The actual word is "+ word);
				// add to results lost counter
				results.lost();
				gameOver = true;
			}		

		}

		// after 3 rounds of guesses

		if(gameOver && word!=null){
			System.out.println("Would you like to play another round (Y/N)");
			String nextRound = inScan.nextLine();

			if(nextRound.toLowerCase().equals("y")){
				nextWord = true;	
			}
			else{
				nextWord = false;
			}

		}
		else{
			System.out.println("No more words");
		}
		

		//results.to2String();


		}

		results.to2String();
		//results.save();

}

}



// add to userName_results.txt

// check if userName exists in directory of results



/// at beggining of program, all known userNames will be loaded into an array.


/// bonus
// userName 

//	if userName is new - created password
		//after new password is created auto sign in for now maybe add a break and make them re sign in?
	// else ask for a password



// idea for additional bonus - history of all plays on one file (by my design)
