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

	System.out.println(userName + ", you have 3 guesses to get the Scramble");
	System.out.println("Good luck!");



// call scramble

	String file = "swamp.txt";
	String fileResults = "results.txt";


	Scramble theScramble = new Scramble(file);

	

	String word = theScramble.getRealWord();


	String word2 = theScramble.getScrambledWord();

	//Results result = new Results(fileResults);

	//result.wins();
	//result.wins();
	//result.losses();




	//System.out.println("Scrambled Word: " + word2);

	String word3 = theScramble.getRealWord();


	String word4 = theScramble.getScrambledWord();
	System.out.println("Scrambled Word: " + word4);	



	



	//System.out.println(word);
	//System.out.println(word);
	//scrambleWord = new Scramble(file);

	//scrambleWord.getRealWord();

	//System.out.println(scrambleWord);


	//String results = scrambleWord(file);
	//scrambleWord.test();
	//System.out.println(scrambleWord);

}

}
