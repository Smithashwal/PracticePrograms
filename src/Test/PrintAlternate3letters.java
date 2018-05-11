package Test;

public class PrintAlternate3letters {

	/*public void alternateLetters(String s, int n) {
		for(int i=0;i<s.length()-n;i=i+6) {
			for(int j=i;j<i+n;j++) {
				System.out.println(s.charAt(j));
			}
		}
	}*/
	
	public void printFromNextChar(String s, int n) {
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				System.out.print(s.charAt(j)+ " ");
			}
		}
	}
	
	public static void main(String[] args) {

		String s= "SMITHASHWAL";
		PrintAlternate3letters printAlternate3letters=new PrintAlternate3letters();
		//printAlternate3letters.alternateLetters(s, 3);
		printAlternate3letters.printFromNextChar(s,3);
	}

}
