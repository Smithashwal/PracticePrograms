package Test;

public class Smithashwal {
	
	public void mergeStrings(String s1, String s2) {
		int i=0,j=0;
	while(i<s1.length() && j<s2.length()) {
			System.out.print(s1.charAt(i) +"" + s2.charAt(j));
		    i++;
		    j++;		
	}
	
	while(i<s1.length()) {
		System.out.print(s1.charAt(i));
		i++;
	}
	
	while(j<s2.length()) {
		System.out.print(s2.charAt(j));
		j++;
	}
	}
	public static void main(String[] args) {
      Smithashwal strings = new Smithashwal();
      strings.mergeStrings("AAAA", "BBBBBB");
	}

}
