package FileReader;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

import Calculate.Calculation;

public class ReadFileTest {

//	String input = "add 2 multiply 3 apply 10";
	ReadFile rf=new ReadFile();
	
	@Test
	public void inputTest() throws IOException {
		
		
		String s1= "add 2";
		String s2= "multiply 3";
		String s3 =  "apply 10";
		
		Deque<Calculation> calculations=rf.read();
		assertEquals(s1,calculations.remove().toString());
		assertEquals(s2,calculations.remove().toString());
		assertEquals(s3,calculations.remove().toString());
	}

}
