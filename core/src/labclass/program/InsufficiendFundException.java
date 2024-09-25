package labclass.program;

public class InsufficiendFundException extends Exception {
	
	int a;

	public InsufficiendFundException(int num) {
		
		 a=num;
		
	}
	
	public String toString() {
		
		String msg="InSuffientFundException:"+"insuffient fund in your acount"+"please keep Rs 500 minimum balance";
		return null;	}
	
	

}
