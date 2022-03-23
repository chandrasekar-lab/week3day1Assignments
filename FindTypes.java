package strings;

/*Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		 Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		 Build the logic to find the count of each
		 Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character


		 Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

 */

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] c = test.toCharArray();
		for (char c1 : c) {
			if ((c1 >= 'a') && (c1 <= 'z') || (c1 >= 'A') && (c1 <= 'Z')) {
				letter++;
			} else if (c1 == ' ') {
				space++;
			} else if ((c1 >= '0') && (c1 <= '9')) {
				num++;
			} else {
				specialChar++;
			}

		}
		System.out.println("letters: " + letter);
		System.out.println("space: " + space);
		System.out.println("numbers: " + num);
		System.out.println("specialCharcters: " + specialChar);

	}

}
