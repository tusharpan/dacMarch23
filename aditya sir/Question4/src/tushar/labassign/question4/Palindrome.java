package tushar.labassign.question4;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		
		String y="";
		for(int i = s.length()-1;i>=0;--i) {
			y+=s.charAt(i);
		}
		if(s.equals(y)) {
			return true;
		}
		
		
		
		
		return false;
	}
	
}
