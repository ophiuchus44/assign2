import java.util.*;
import java.io.*;

public class Results{
	

	private int rounds;
	private int wins;
	private int losses;

	private String fileLocation;

	private String password;

public Results(String fileLocation2){
	fileLocation = fileLocation2;

	
	try{

	
	File userFile = new File(fileLocation);

	Scanner scan = new Scanner(userFile);

	rounds = scan.nextInt();

	wins = scan.nextInt();
	losses = scan.nextInt();

	}
	catch (Exception ex) {
            ex.printStackTrace();

	}



	// should read in info from file location and set these values
	// inteads of starting at 0
	//wins = 0;
	//losses = 0;
	//rounds = 0;
}

//public Results(String fileInput){
//	fileLocation = fileInput;
//}


public void won(){
	wins++;
	System.out.println("Wins: " + wins);
	}

public void lost(){
	losses++;
	System.out.println("Losses: " + losses);

	}

public void save(){
	// take file location and create a file object
	//File userFile = new File(fileLocation)

	//Scanner scan = new Scanner(userFile)

	// write to results
}


public void to2String(){
	rounds = losses + wins;

	System.out.println("Rounds: " + rounds);
	System.out.println("Wins: " + wins);
	System.out.println("Losses: " + losses);
}

public void savePassword(String newPassword){
	password = newPassword;
	System.out.println("Would be saved now");


}


}


//public void save(){
//	FileWriter fw = new FileWriter(fileLocation, true);
//	BufferedWriter bw = new BufferedWriter(fw);
//	PrintWriter pw = new PrintWriter(bw);

//	pw.prinln(wins);
//	pw.prinln(losses);
//	pw.prinln(rounds);
//}


/// end of class ///

/// end of class ///