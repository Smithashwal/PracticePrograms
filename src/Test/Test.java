package Test;

public class Test {

	public void palindrome(String s) {
		boolean isPalindrome=true;
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		String s= "MALAYALAM";
		Test palindrome= new Test();
		palindrome.palindrome(s);
		
	}
	
}
