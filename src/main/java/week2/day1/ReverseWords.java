package week2.day1;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "hi testleaf";
	        String[] nameSplit = name.split(" ");
	        
	        char[] firstName = nameSplit[0].toCharArray();
			char[] secondName = nameSplit[1].toCharArray();
			
	        for(int i = firstName.length - 1; i >= 0; i-- )
	            System.out.print(firstName[i]);
	        
	        for(int j = secondName.length - 1; j >= 0; j-- )
	            System.out.print(secondName[j]);
	        }

}
