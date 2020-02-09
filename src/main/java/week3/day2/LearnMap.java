package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "pooja";
		char[] ca = s.toCharArray();

		int count = 1;

		Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ca.length; i++) {
			if (obj.containsKey(ca[i])) {
				obj.put(ca[i], count + 1);
			} else {

				obj.put(ca[i], count);
			}

		}
		System.out.println(obj);

	}
}