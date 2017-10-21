import java.util.*;
import java.io.*;
import java.lang.*;

public class assign2{
	

public static void main (String [] args){
	
	Scanner inScan = new Scanner(System.in);

	System.out.println("Welcome to the Scrambler!");

	System.out.print("What is your name? ");

	// when saving different users/ need a remember me place and create new account section here

	String userName = inScan.nextLine();


	//boolean isGuest = false;

	//String 

	// if name exists, prompt for password

	// if name does not exist,
		//do you want to create an account?
		// if yes they want to create account
				// create account userName_results.txt
		// if no then they will be referred to as a Guest 
				//(only internally - filesaves as Guest_results.txt)


	// will need to be able to cut the _results.txt portion when searching for names
	// probably a stringbuilder thing? cut from the Right the same 8 or so spaces? prob easiest


	System.out.println(userName + ", you have 3 guesses to get the Scramble");
	System.out.println("Good luck!");



// call scramble

	String file = "swamp.txt";

	// results file will concate with userName
	String fileResults = "_results.txt";


	Scramble theScramble = new Scramble(file);

	// grab a word from txt

	String word = theScramble.getRealWord();

	// grab scrambledword from class
	String wordScrambled = theScramble.getScrambledWord();
	
	System.out.println("Scrambled Word: " + wordScrambled);	

	// i created a class guess for making this step easier
	// here i initiallize the class
	Guess guess = new Guess(word, wordScrambled);

	System.out.println("Make a guess: ");

	String userGuesses = inScan.nextLine();
	
	while(userGuesses.length()> word.length()){
		System.out.println("You guesssed too many letters");
		System.out.println("Guess again");		
		userGuesses = inScan.nextLine();
		}

	String isRight = guess.userGuess(userGuesses);

	
	boolean correct = false;
	int guesses = 0;

	if(isRight.equals(word)){
		System.out.println(isRight);
		correct = true;
	}
	else{
		System.out.println(isRight);

	//	int guesses = 0;
		

		//while ((userGuesses.length()> word.length()) && guesses<=2 && !correct){
		while (!correct && guesses<=1){
		//System.out.println("You guesssed too many letters");
		System.out.println("Guess again");		
		userGuesses = inScan.nextLine();
		while(userGuesses.length()> word.length()){
			System.out.println("You guesssed too many letters");
			System.out.println("Guess again");		
			userGuesses = inScan.nextLine();
		}

		isRight = guess.userGuess(userGuesses);

		if (isRight.equals(word)){
			correct = true;
		}
		System.out.println(isRight);
		guesses++;

		}	
	}

	System.out.println("outside");
	

	//String isRight = guess.userGuess(userGuesses);

	//System.out.println(isRight);

	//userGuesses = inScan.nextLine();

	//isRight = guess.userGuess(userGuesses);
	
	//System.out.println(isRight);

	//userGuesses = inScan.nextLine();

	//isRight = guess.userGuess(userGuesses);
	
	//System.out.println(isRight);

//	String userGuessVReal = guess.guessVSreal(userGuesses);

//	System.out.println(userGuessVReal);

/*	int guessCount = 1;

	while(!isRight && guessCount<=2){
	if (!isRight){
		guessCount++;
		System.out.println("Make another guess: ");	
		userGuesses = inScan.nextLine();
		isRight = guess.userGuess(userGuesses);
		userGuessVReal = guess.guessVSreal(userGuesses);
		}
	}

	System.out.println("User is right? " + isRight);
*/




//	word = theScramble.getRealWord();
//	wordScrambled = theScramble.getScrambledWord();

//	System.out.println("Next Word: " + word);	
//	System.out.println("Next scrambledword: " + wordScrambled);

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
