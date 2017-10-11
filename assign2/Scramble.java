import java.util.*;
import java.io.*;
import java.lang.*;

public class Scramble{
	
	private String currentWord;
	private String scrambledWord;
	private Scanner inputFile;
	private FileReader inputF;
	private BufferedReader inputFb;
	private File file;
	private char [] characters;

	private boolean isScrambled;
	private boolean canRead = true;

	public Scramble(String filePath){

		try{
			file = new File(filePath);
			//Scanner inputFile = new Scanner(file);
			inputF = new FileReader(file);
			inputFb = new BufferedReader(inputF);
		//	System.out.println("File Opened!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Exit Scramble Constructor");
	}

 
	public String getRealWord(){
		// canRead
		if(inputFb != null && canRead){
			try {
				currentWord = inputFb.readLine();
			}
			catch(Exception e) {
			e.printStackTrace();
			}
		}
		
		isScrambled = false;
		canRead = false;
		return currentWord;
		}


	public String getScrambledWord(){
// uses CharArray // need to find different emethod
//		System.out.println(currentWord);
		if (isScrambled && scrambledWord != null){
			return scrambledWord;
		}



		// if currentWord is null, then scrambleWord is null
		if(currentWord==null){
			scrambledWord = null;	
    		}
		



// where the shuffle happenes
    	else{
    		// need a couple stringbuilders for my shuffler
    		StringBuilder sb = new StringBuilder(currentWord);
			int len = sb.length();
	
			StringBuilder newString = new StringBuilder();

			StringBuilder intString = new StringBuilder();


		while(intString.length()<len){
			for (int i = 0; i<len; i++){
				Random r = new Random();
				int x = r.nextInt(len);
				String newX = Integer.toString(x);
				if (intString.toString().contains(newX)){
					break;	
					}
				else{
					intString.append(x);	
					}
				}
		
			}

	//System.out.println(intString);

	for (int a = 0; a<len; a++){

			int temp = Character.getNumericValue(intString.charAt(a));

			newString.append(sb.charAt(temp));
		}

	//		System.out.println(newString);
			scrambledWord = newString.toString();

    	}



/*

		else{
		char[] characters = currentWord.toCharArray();
    		for (int i = 0; i < characters.length; i++) {
        		int randomIndex = (int)(Math.random() * characters.length);
        		char temp = characters[i];
        		characters[i] = characters[randomIndex];
        		characters[randomIndex] = temp;
        		scrambledWord = new String(characters);
					}
			} */
    	
    	//scrambledWord = new String(characters);
		isScrambled = true;
		canRead = true;
    	return scrambledWord;
	
/*		System.out.println("Current Word is: " + currentWord);
		Random r = new Random();
		StringBuilder str = new StringBuilder(currentWord);
		scrambledWord = Integer.toString(str.indexOf(currentWord));	
		return scrambledWord;
	*/
	}


	//inputF.close();

/// end of class ///
}
/// end of class ///




////// major bugs

// getWord condition either makes the normal use cases work or the special cases but not both



////// next 

// need to ask prof ramirez about data structure for file. bonus. either need to do columns name/w/l/tries
// or i need to name every file after the user but store additional information like a password or their 
// history of games played



/////// if i have time

// bonus - save players games 
// login - take a username and a password
// 