package Test;

public class ContainsSameChars {

	public void containsSameChar(String s1, String s2) {
		int i = 0, j = 0;

		char[] a1= s1.toCharArray();
		char[] a2= s2.toCharArray();
		if (a1.length != a2.length) {
			System.out.println("It is not an anagram");
		}else {
			

			
		}
	}

	public static void main(String[] args) {

		String s1 = "LISTEN";
		String s2 = "SILENT";

		ContainsSameChars containsSameChars = new ContainsSameChars();
		containsSameChars.containsSameChar(s1, s2);
	}

}
