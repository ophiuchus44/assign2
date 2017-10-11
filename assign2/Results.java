import java.util.*;
import java.io.*;

public class Results{
	

public static void main (String [] args){

	private int rounds;
	private int wins;
	private int losses;

	private String fileLocation;

/// end of main ///
	}
/// end of main ///

public Results(String fileInput){
	fileLocation = fileInput;
}


public void won(){
	wins++;
	System.out.println(wins);
}

public void lost(){
	losses++;
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
}
/// end of class ///