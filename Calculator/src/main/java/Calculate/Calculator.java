package Calculate;

public class Calculator {

	
	private int value;

	public Calculator(int value) {
		super();
		this.value = value;
	}
	
	public Calculator() {}
	
	

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
	
	public void subtract(int value) {
		this.value-=value;
	}
	
	public void divide(int value) {
		if(value==0) {
			throw new RuntimeException("can't devide by 0");
		}
		this.value=this.value/value;
	}
	 
	

}
