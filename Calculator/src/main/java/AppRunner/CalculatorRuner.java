package AppRunner;

import java.io.IOException;
import java.util.Deque;

import Calculate.Calculation;
import Calculate.StaticCalculator;
import FileReader.ReadFile;

public class CalculatorRuner {

	public static void main(String[] args) throws IOException {
		
		ReadFile rf=new ReadFile();
		Deque<Calculation> calculations=rf.read();
		int initValue=calculations.removeLast().getValue();
		StaticCalculator sc=new StaticCalculator(initValue);
		
		CalculatorSwitch cSwitch=new CalculatorSwitch();
		cSwitch.calculatorSwitch(sc, calculations);
		
		
		
		

		
	}

}
