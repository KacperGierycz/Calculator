package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import Calculate.Calculation;
import Calculate.Operation;

public class ReadFile {
	
	public Deque<Calculation> read()throws IOException {
		
		Deque<Calculation> calculations=new LinkedList<>();
		
		    try {
		      File myObj = new File("src/main/resources/input.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		    	  
		    	  String operation=myReader.next();
		    	  int value = myReader.nextInt();
		    	  
		    	  Calculation calc=new Operation(operation,value);
		    	  calculations.add(calc);
		    	  
		    	  

		       // System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    System.out.println(calculations);
			return calculations;
		}
	
		}









