package Test;

public class StringMerge {
	
	public void mergeStrings(String s1, String s2) {
		int i=0;//j=0;
		while(i<s1.length() && i<s2.length()) {
			System.out.print(s1.charAt(i)+ "" + s2.charAt(i));
			i++;
			//j++;
		}
		
		while(i<s1.length()) {
			System.out.print(s1.charAt(i));
			i++;
		}
		
		while(i<s2.length()) {
			System.out.print(s2.length());
			i++;
		}
	}

	public static void main(String[] args) {

		String s1= "ASHWALDIXIT";
		String s2= "SMITHA";
		
		StringMerge mergedString = new StringMerge();
		mergedString.mergeStrings(s1, s2);
	}

}
