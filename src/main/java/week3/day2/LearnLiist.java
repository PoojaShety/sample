package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnLiist {

	public static void main(String[] args) {
	
		List<String> name =new ArrayList();
		Set<String> obj1=new HashSet<String>();
		Set<String> obj2=new HashSet<String>();
		name.add("Pooja");
		name.add("Sharmila");
		name.add("Anu");
		name.add("Divya");
		name.add("Barat");
		name.add("Divya");
		
		/*
		 * int size = name.size(); System.out.println(size);
		 */
			
		for (String each : name) {
			
		
			if(obj1.add(each)) {
				
			}else {obj2.add(each);
				
			}
		
		
		}
	
	obj1.removeAll(obj2);
		System.out.println("unique"+"-->"+obj1);
		System.out.println("duplicate"+"-->"+obj2);
			
		
				
			
	}
		

	

}
