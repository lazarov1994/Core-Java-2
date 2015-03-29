package Tests;

public class NumberOfDigits {
	public int getNumberOfDigits(int input) {
		char[] chars = ("" + input).toCharArray();
		int counter = 0;
		for (int i = 0; i < chars.length; i++) {

			if (chars[i] <= '9' && chars[i] >= '0') { // After adding the "=" -> (chars[i] <= '9' && chars[i] >= '0')
				counter++;
			}
		}
		return counter;
	}
}
