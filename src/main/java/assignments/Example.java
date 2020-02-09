package assignments;

public class Example {
	
	public static void main(String[] args) {
	
		String name="pooja shetty";
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("s"));
		System.out.println(name.lastIndexOf("o"));
		
		String[] split = name.split(" ");
		for(int i=0;i<split.length;i++)
			System.out.println(split[i]);
		
		System.out.println(name.substring(1, 4));
	}

}
