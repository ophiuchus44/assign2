import java.util.*;
import java.io.*;

public class Results{
	

	private int rounds;
	private int wins;
	private int losses;

	private String fileLocation;


	

public Results(String fileLocation2){
	fileLocation = fileLocation2;
	wins = 0;
	losses = 0;
	rounds = 0;
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


	// write to results
}

public void to2String(){
	rounds = losses + wins;

	System.out.println("Rounds: " + rounds);
	System.out.println("Wins: " + wins);
	System.out.println("Losses: " + losses);
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