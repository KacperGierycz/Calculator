package Calculate;

public class StaticCalculator {

	
	 private int value;

	public StaticCalculator(int value) {
		super();
		this.value = value;
	}
	
	public StaticCalculator() {}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void add(int value) {

		
		this.value+=value;
		
		
	}
	
	public void multiply(int value) {
		this.value=this.value*value;
	}
	 
	

}
