package practice;

public class reverseString {

	public static void main(String[] args) {
		String name="I am good";
		 char[] charArray=name.toCharArray();
		 for(int i=charArray.length-1;i>=0;i--)
		 {
			 System.out.println(charArray[i]);
		 }

	}

}
