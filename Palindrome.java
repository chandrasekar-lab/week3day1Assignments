package strings;


//Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String s ="Madam";
		char[] ch;
		String reV = "";
		ch=s.toCharArray();
		Arrays.toString(ch);
		for(int i=ch.length-1;i>=0;i--) {
			reV=reV+String.valueOf(ch[i]);
		}

		System.out.println(reV);

		if(s.equalsIgnoreCase(reV)) {
			System.out.println("palindrome successful");
		}

	}
}
