package week2.day1;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			String name= "Pooja,Sharmila,Deepa,Vignesh,Bharat";
			String[] split = name.split(",");
			
			for(int i=0;i<split.length;i++)
				
			{
				//System.out.println(split[i]);
				if(split[i].startsWith("S")||split[i].endsWith("a")) {
					
				
				System.out.println(split[i]);
				
				}
			}
			
			
			
		}


	}


