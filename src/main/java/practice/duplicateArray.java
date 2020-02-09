package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateArray {

	public static void main(String[] args) {
		
	int array[]= {1,2,3,3,4,5,6,6};
		
			int n=array.length;
			Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(array[j]==array[i]) {
						dupNumbers.add(array[i]); 
					}
				}
			}
			System.out.println(dupNumbers);
			//System.out.println();

	}

}
