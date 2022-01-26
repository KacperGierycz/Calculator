package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

import Calculate.Calculation;
import Calculate.Operation;

public class ReadFile {
	
	public Deque<Calculation> read()throws IOException {
		
		Deque<Calculation> calculations=new LinkedList<>();
		
		    try {
		    	
		      File myObj = new File("src/main/resources/input.txt");
		      
		      
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		      

		    	 myReader.skip("\\s*");
		    	 if (!myReader.hasNextLine()) {
		    		 break;
		    	 }

			    	  String operation=myReader.next();
			    	  int value = myReader.nextInt();

			    	  Calculation calc=new Operation(operation,value);
			    	  calculations.add(calc);
		      
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
			return calculations;
		}
	
		}









