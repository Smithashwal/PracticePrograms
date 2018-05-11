package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatString {

	public void stringRepeat(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					System.out.println(s1.charAt(i));
				}
			}
		}

	}
//OR
	public void repeatString(String s1) {
		char[] s = s1.toCharArray();
		boolean charFound = false;

		for (int i = 0; i < s.length; i++) {
			if (!charFound) {

				char temp = s[i];
				for (int j = i + 1; j < s.length; j++) {
					if (temp == s[j]) {
						System.out.println("First Repeating Char is : " + s[j] + " and First Occurrance is at :"
								+ (i + 1) + " Repeating char is at position :" + (j + 1));
						charFound = true;
						break;
					}

				}

			}
		}
		if (!charFound) {
			System.out.println("No repeat char");
		}
	}

	public void getStringRepeat(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				//int occur = map.get(s.charAt(i))+1;
				//occur++;
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		int count=0;
		for(Entry<Character, Integer> e : map.entrySet()) {
			if(e.getValue()>1) {
				count++;
			}
			if(count==4) {
				System.out.println("the 4th repeating character is: " + e.getKey());
			}
		}
		/*int count=0;
		for(Entry<Character, Integer> e: map.entrySet()) {
			if(e.getValue()==1) {
				count++;
			}
			if(count==2){
				System.out.println("The second non repeating character is: " + e.getKey());
				break;
			}
		}*/
		
	}

	public static void main(String[] args) {

		String s1 = "abbcddddeeeefff";

		FirstRepeatString stringCalculator = new FirstRepeatString();
		//stringCalculator.stringRepeat(s1);

		//stringCalculator.repeatString(s1);
		
		stringCalculator.getStringRepeat(s1);

	}

}
