package Calculate;

public class Operation implements Calculation {
	
	private String operation;
	private int value;
	
	public Operation(String operation, int value){
		this.operation=operation;
		this.value=value;		
	}
	
	@Override
	public int getValue() {
		
		return this.value;
	}
	@Override
	public String getOperation() {
		
		return this.operation;
	}

	@Override
	public String toString() {
		return  operation + " " + value ;
	}
	
	


}
