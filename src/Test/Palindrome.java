package Test;

public class Palindrome {

	public void isPalindrome(String s) {
		boolean isPalindrome = true;
		char[] a = s.toCharArray();
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] == a[j]) {
				i++;
				j--;

			} else {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
		// return isPalindrome;
	}

	public static void main(String[] args) {
		String s = "MALAYALAM";
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome(s);

	}

}
