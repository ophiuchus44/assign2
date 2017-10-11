import java.util.*;
import java.io.*;
import java.lang.*;

public class test1{
	

public static void main (String [] args){

	String tester = "tester";

	StringBuilder sb = new StringBuilder(tester);
	int len = sb.length();
	
	StringBuilder newString = new StringBuilder();

	StringBuilder intString = new StringBuilder();

	//Random r = new Random();

	//int x = r.nextInt(len);


while(intString.length()<len){
	for (int i = 0; i<len; i++){
		Random r = new Random();
		int x = r.nextInt(len);
		String newX = Integer.toString(x);
//		while(intString.length()<len){
			if (intString.toString().contains(newX)){
			break;	
			}
		else{
			intString.append(x);	
			}
		}
		
	}

	System.out.println(intString);






	for (int a = 0; a<len; a++){

		//newString = sb.substring(a);

		int temp = Character.getNumericValue(intString.charAt(a));

		//newString = sb.toString().substring(temp);

		newString.append(sb.charAt(temp));
	}

	System.out.println(newString);

	//for (int i = 0; i<len; i++){
	//	Random r = new Random();
	//	int x = r.nextInt(len);

		//newString.append(sb.charAt(x))

		//System.out.println(sb.charAt(i));
	//	System.out.println(sb.charAt(i));
		//System.out.println(sb.indexOf(tester));
	//}


	//Random r = new Random();

	//int x = r.nextInt(len);

	//System.out.println(newString.length());
	//System.out.println(newString);

	//newString.append(sb.charAt(2));

	//System.out.println(newString.length());
	//System.out.println(newString);
	//System.out.println(x);
	//System.out.println(sb.charAt(2));


	}
}
