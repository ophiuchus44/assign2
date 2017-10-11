import java.io.*;
import java.util.*;
public class MyScramTest
{
    public static void main(String[] args) throws IOException
    {
    	System.out.println("Testing normal use...\n");
        Scramble theScramble = new Scramble("swamp.txt"); 
        // Create Scramble object using the file name as an argument.  Note
		// that this constructor does not actually read in any words.
        // Sentinel controlled loop.  Keep getting words and showing them until returned
        // word is null..		
        String word = theScramble.getRealWord();
        while (word != null)	
        {
            ////////// what is difference  betweeen real word and current word?!?!?!!?!?!?! ////
        	System.out.println("Real word is : " + 	word);
        	System.out.println("Scrambled word is: " + theScramble.getScrambledWord());
        	
        	word = theScramble.getRealWord();
        }
    }
}
