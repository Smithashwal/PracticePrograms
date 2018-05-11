package Test;

public class ContainsString {

	public boolean contains(String s1, String s2) {

		for (int i = 0; i <s1.length(); i++) {
			int j = 0,x=i;
			while (x < s1.length() && j < s2.length()) {

				if (s1.charAt(x) == s2.charAt(j)) {
					x++;
					j++;
				} else {
					break;
				}
			}
			if (j == s2.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String s1 = "sasasasat";
		String s2 = "sasasat";

		if(new ContainsString().contains(s1, s2)) {
			System.out.println("String1 contains String2");
		}
		else {
			System.out.println("String1 doesn't contain String2");
		}
	}

}
