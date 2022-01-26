package AppRunner;

import java.io.IOException;
import java.util.Deque;

import Calculate.Calculation;
import Calculate.Calculator;
import FileReader.ReadFile;

public class CalculatorRuner {

	public static void main(String[] args) throws IOException {
		
		ReadFile rf=new ReadFile();
		Deque<Calculation> calculations=rf.read();
		int initValue=0;
		
		if (calculations.getLast().getOperation().equals("apply")) {
		
		 initValue=calculations.removeLast().getValue();
		}
		else {
			System.out.println( "no apply; defoult value: 0");
		}
		
		
		System.out.println("value initialized with: "+initValue);
		
		Calculator sc=new Calculator(initValue);
		
		CalculatorSwitch cSwitch=new CalculatorSwitch();
		System.out.println("Operations to calculate: "+calculations);
		cSwitch.calculatorSwitch(sc, calculations);
		
		
		System.out.println("value: "+sc.getValue());
		

		
	}

}
