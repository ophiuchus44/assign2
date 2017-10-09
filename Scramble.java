import java.util.*;
import java.io.*;


public class Scramble{
	
	//private File file;
	//private Scanner inScan;
	// constructor takes name of text file as argument
	private String currentWord;
	private Scanner inputFile;

	private FileReader inputF;
	private BufferedReader inputFb;
	private File file;

	public Scramble(String filePath){

		try{
			file = new File(filePath);
			//Scanner inputFile = new Scanner(file);
			inputF = new FileReader(file);
			inputFb = new BufferedReader(inputF);
			System.out.println("File Opened!");


// check that prints everything in input file
//				while (inputFile.hasNext()){
//				data = inputFile.nextLine();
//				System.out.println(data);
//			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		System.out.println("Exit Scramble Constructor");
	}



 
	public String getRealWord(){

		if (inputF !=null){
			try {
			currentWord = inputFb.readLine();
			//System.out.println(currentWord);	
			}
			catch(Exception e) {
			e.printStackTrace();
			}

		}

		return currentWord;

		}


	public String getScrambledWord(){
		System.out.println("Current Word is: " + currentWord);
		return currentWord;
	}



/// end of class ///
}
/// end of class ///