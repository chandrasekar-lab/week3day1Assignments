package strings;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */


import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length())
			System.out.println("Both strings  are same Size");

		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == s2[i]) {
				System.out.println("Both the arrays have same values in index:" + i);
			}
		}

	}

}
