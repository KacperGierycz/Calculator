package AppRunner;

import java.util.Deque;

import Calculate.Calculation;
import Calculate.Calculator;

public class CalculatorSwitch {
	
	
	
	public void calculatorSwitch(Calculator sc, Deque<Calculation> calculations) {
		
		while(!calculations.isEmpty()) {
			Calculation oper=calculations.remove();
			String whatToDo=oper.getOperation();
			int value=oper.getValue();
			
			
			
			switch(whatToDo) {
			
			case"add": sc.add(value);
			break;
			case"multiply":sc.multiply(value);
			break;
			default: throw new RuntimeException("unsupported operation");
			
			
			
			
		}
		
}
		
	}

}
