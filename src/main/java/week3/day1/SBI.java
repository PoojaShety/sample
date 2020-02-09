package week3.day1;

public class SBI implements RBI,Cibil{
	
	

	public void maxTransLimit()
	{
		System.out.println("Max limit 3 lakh");
	}
	public void minBalance()
	{
		System.out.println("Minimum balance should be 50000");
	}
	public void verifyAadhaar()
	{
		System.out.println("Verified");
	}
	
	public void getCreditScore()
	{
		System.out.println("Credit Score");
	}
	

	public static void main(String[] args) {
		
		SBI obj=new SBI();
		obj.maxTransLimit();
		obj.minBalance();
		obj.verifyAadhaar();
		obj.getCreditScore();
		
	}

}
