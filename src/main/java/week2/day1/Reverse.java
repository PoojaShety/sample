package week2.day1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words="Hi Testleaf";
		String[] split = words.split(" ");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
//char[] charArray = words.toCharArray();

char[] charArray = words.toCharArray();




for(int i=charArray.length-1;i>=0;i--) {
	System.out.print(charArray[i]);
	
	
}
	}

}
