package week2.day1;

public class OddUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="testleaf";
		char[] charArray = name.toCharArray();
		int num = 'a';
		char b = (char) (num +32);
		for(int i = 1; i< charArray.length; i=i+2) 
	       {
	    	   System.out.print((charArray[i]+b));
	    	   
	       }   
		//System.out.print("\n"+name.toUpperCase());
	}

}
