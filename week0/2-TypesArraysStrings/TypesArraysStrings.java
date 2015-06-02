import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.print.CancelablePrintJob;

public class DoubleF {

	static int split(int[] list, int low, int high) { // This function finds the
														// real place of the
														// 1st(0) element and
														// puts it there,
		// also puts the element that has been there to the 1st(0) position,
		// where has been the 1st(0) element.
		// While doing this the function replaces some elements and in the end
		// all elements of the left side of the pivot are smaller and
		// respectively larger on the right.
		int left = low + 1; // Left is the 2nd el
		int right = high; // Right is the nth el
		int pivot = list[low]; // The pivot is the 1st el

		while (true) {
			// The next 2 loops will move the left n right pointers to an
			// elements which are greater or smaller than the pivot,
			// than we will check if left >= right, if it is we will stop
			// and if it's not we will swap the values of the elements on the
			// left and right position
			// and we will move them one more time in right or left direction.
			while (left <= right) {
				if (list[left] <= pivot) {
					// We move "left" (left is a pointer not a value also as
					// right)
					left++;
				} else {
					break;
				}
			}
			while (right > left) {
				if (list[right] >= pivot) {
					// We move "right"
					right--;
				} else {
					break;
				}
			}
			if (left >= right) { // Here we stop, we break from the "true loop"
				break;
			}
			// Otherwise we swap left and right items
			int temp = list[left];
			list[left] = list[right];
			list[right] = temp;
			// advance left n right with one more step for each, cause they are
			// swapped and they r okay with the top conditions for "moving"
			left++;
			right--;

		}

		// swap pivot with left-1 position

		list[low] = list[left - 1];
		list[left - 1] = pivot;
		return left - 1; // we return the pointer of the pivot

	}

	static void sort(int[] list, int low, int high) {
		if (high - low <= 0) {
			return;
		}
		int splitPoint = split(list, low, high); // We get the pivots "pointer"
		sort(list, low, splitPoint - 1); // Left subarray recursion, of course
											// it can divide to more subarrayss
											// and the recursion can continue
		sort(list, splitPoint + 1, high); // Right subarray recursion, of course
											// it can divide to more subarrays
											// and the recursion can continue

	}

	static void sort(int[] list) {
		if (list.length <= 1) {
			return;
		}
		sort(list, 0, list.length - 1);
	}

	// DOUBLEF MISSING
	static long kthFac(int k, int n) {
		int sum = n;

		for (int i = k; i < n; i += i) {
			sum = sum * (n - i);
		}

		return sum;
	}

	// WRONG SOLUTION
	static long getSmallestMultiple(long upperBound) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int helper = 0;
		for (int i = 1; i < upperBound + 1; i++) {
			a.add(i);
		}
		// System.out.println(a);
		for (int i = 2; i < upperBound + 1; i++) {
			helper = 0;
			for (int j = 1; j < upperBound; j++) {
				if (a.get(j) % i == 0) {
					a.set(a.get(j), a.get(j) / i);
					helper++;
				}
				if (j == upperBound - 1 && helper > 0) {
					b.add(i);
				}
			}
		}
		// System.out.println(a);
		int gSm = a.get(1);
		// System.out.println(a.get(0));
		for (int i = 1; i < b.size(); i++) {
			gSm = gSm * b.get(i);
		}

		return gSm;
	}

	static long getLargestPalindrome(long N) {
		long theLargestPalindromeBeforeNis = 0;
		for (long i = N; i > 0; i--) {
			if (isPalindrome(Long.toString(i))) {
				theLargestPalindromeBeforeNis = i;
				break;
			}

		}
		return theLargestPalindromeBeforeNis;
	}

	int[] histogram(short[][] image) {
		int[] answear = new int[256];
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				answear[image[i][j]]++;
			}
		}

		return answear;

	}

	static long pow(int a, int b) {
		if (b == 0) {
			return 1;
		}

		if (b == 1) {
			System.out.println("*");
			return a;
		}

		if (b % 2 == 0) {

			return pow(a, b / 2) * pow(a, b / 2);
		}

		else {

			return a * pow(a, (b - 1) / 2) * pow(a, (b - 1) / 2);
		}
	}

	static int getOddOccurrence(int... array) {
		Arrays.sort(array);
		int counter = 0;

			
			for (int i = 0; i < array.length - 1 ; i++) {
				if(array[i]==array[i+1]){
					counter++;
				}
				else{
					if(counter%2==0) return array[i];
					else counter = 0;
				}
					
			}
									        // That means that the element that
											// we r
											// looking for is the largest by
											// value
											// of all and he is on the last position. 
		
		return array[array.length-1];
	}

	static int getOddOccurrence1(int... array) {

		int[] helper = new int[1000];
		for (int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}
		int element = 0;
		for (int i = 0; i < helper.length; i++) {
			if (helper[i] % 2 != 0) {
				element = i;
				break;
			}
		}
		return element;

	}

	static long maximalScalarSum(int[] a, int[] b) {
		// sort(a); sort(b);
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;

	}

	static int maxSpan(int[] numbers) { // SLOW SOLUTION !!!
		ArrayList<Integer>[] helper = new ArrayList[1000];

		for (int i = 0; i < numbers.length; i++) {
			helper[numbers[i]] = new ArrayList<Integer>();
		}
		for (int i = 0; i < numbers.length; i++) {
			helper[numbers[i]].add(i);

		}
		int pathLenght = 0;
		for (int i = 0; i < numbers.length; i++) {
			// System.out.println("here" + helper[numbers[i]].get(0) + " "+
			// helper[numbers[i]].get(helper[numbers[i]].size() - 1) );
			// System.out.println("here " + (
			// helper[numbers[i]].get(helper[numbers[i]].size() - 1) -
			// helper[numbers[i]].get(0) ) );
			if (pathLenght <= helper[numbers[i]]
					.get(helper[numbers[i]].size() - 1)
					- helper[numbers[i]].get(0)) {
				pathLenght = helper[numbers[i]]
						.get(helper[numbers[i]].size() - 1)
						- helper[numbers[i]].get(0);
			}
		}
		return pathLenght + 1;
	}

	static boolean canBalance(int[] numbers) {
		boolean canHe = false;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		if (sum % 2 != 0) {
			return false;
		} else {
			int halfSum = 0, i = 0;
			while (halfSum < sum / 2) {
				halfSum += numbers[i];
				i++;
			}

			if (halfSum == sum / 2) {
				return true;
			}
		}
		return false;
	}

	static boolean canBalance2(int[] numbers) {
		int[] sum11 = new int[numbers.length];
		int[] sum22 = new int[numbers.length];
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum1 = sum1 + numbers[i];
			sum11[i] = sum1;
			sum2 = sum2 + numbers[numbers.length - 1 - i];
			sum22[i] = sum2;
		}

		// System.out.println();
		for (int i = 0; i < numbers.length - 1; i++) {
			// System.out.println( "sum11 " + sum11[i] + " sum22 " +
			// sum22[numbers.length-2-i]);
			if (sum11[i] == sum22[numbers.length - 2 - i]) {
				return true;
			}
		}

		return false;

	}

	int[][] rescale(int[][] original, int newWidth, int newHeight) {
		int h1 = original.length;
		int w1 = original[0].length;

		double coef = w1 / newWidth;
		double coef2 = h1 / newHeight;

		int[][] answer = new int[newWidth][newHeight];
		for (int i = 0; i < coef2; i++) {
			for (int j = 0; j < coef; j++) {
				answer[i][j] = original[(int) (i * coef)][(int) (j * coef2)];
			}
		}
		return answer;
	}

	static String reverseEveryChar(String arg) {
		arg.split("\\s+");
		StringBuilder b = new StringBuilder();
		String[] a = arg.split("\\s+");
		for (int i = 0; i < a.length; i++) {

			b.append(reverseMe(a[i]) + " ");
		}
		b.deleteCharAt(b.length() - 1);

		return b.toString();

	}

	static String reverseMe(String argument) {
		char[] a = argument.toCharArray();

		char helper = ' ';
		if (a.length % 2 != 0) {
			for (int i = 0; i <= a.length / 2; i++) {
				helper = a[i];
				a[i] = a[a.length - 1 - i];
				a[a.length - 1 - i] = helper;
			}
		} else {
			for (int i = 0; i < a.length / 2; i++) {
				helper = a[i];
				a[i] = a[a.length - 1 - i];
				a[a.length - 1 - i] = helper;
			}
		}
		String b = new String(a);
		return b;
	}

	static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < (n / 2) + 1; ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}

		return true;
	}

	static boolean isPalindrome(int argument) {
		char[] a = ("" + argument).toCharArray();
		for (int i = 0; i < a.length / 2 + 1; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	static String copyEveryChar(String input, int k) {
		char[] a = new char[input.length() * k];
		char[] b = input.toCharArray();
		// ArrayList<Character> b1 = new ArrayList<Character>();
		StringBuilder b1 = new StringBuilder();
		for (int i = 0; i < b.length; i++) {
			if (b[i] == ' ') {
				b1.append(b[i]);
			} else {
				for (int j = 0; j < k; j++)
					b1.append(b[i]);
			}
		}

		return b1.toString();

	}

	static int getPalindromeLength(String input) {

		char[] a = input.toCharArray();
		int number = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '*') {
				number = i;
				break;
			}
		}
		// System.out.println("THE PLACE WHERE THE STAR IS IS: " + number);
		int length = 0;
		int i = 0;
		// for(int i = 0 ; i < a.length - number; i++){
		while (number - 1 - i >= 0 && number + 1 + i <= a.length - 1
				&& a[number - 1 - i] == a[number + 1 + i]) {
			// System.out.println("a-1:" +a[number+1+i] +" a+1: "
			// +a[number-1-i]);
			// if(a[number-1-i] == a[number+1+i]){
			i++;
			length++;

		}
		// else break;

		// }
		return length;
	}

	static int getPalindromeLength1(String input) {

		char[] a = input.toCharArray();
		int number = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '*') {
				number = i;
				break;
			}
		}
		// System.out.println("THE PLACE WHERE THE STAR IS IS: " + number);
		int length1 = 0;
		if (number >= input.length() / 2) {
			// System.out.println("a.length - number: " + (a.length - number));
			for (int i = 0; i < a.length - number - 1; i++) {

				// System.out.println("a-1:" +(number+1+i) +" a+1: " +
				// (number-1-i));
				if (a[number - 1 - i] == a[number + 1 + i]) {

					length1++;

				} else
					break;
			}
			return length1;

		} else {
			for (int i = 0; i < number; i++) {

				// System.out.println("a-1:" +(number+1+i) +" a+1: " +
				// (number-1-i));
				if (a[number - 1 - i] == a[number + 1 + i]) {

					length1++;

				} else
					break;
			}
			return length1;

		}

	}

	static int countOcurrences(String needle, String haystack) {
		char[] a = haystack.toCharArray();
		char[] b = needle.toCharArray();
		int counter = 0;
		// ada11daadad1da
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println("k = "+k + " i=" + i);
			// System.out.println("b[k]= "+b[k] + " a[i]= "+a[i] );
			if (b[k] == a[i]) {
				// System.out.println("k++");
				k++;
			} else {
				k = 0;
				// System.out.println("k=0");
			}
			if (k == b.length) {
				counter++;
				k = 0;
			}
			// System.out.println("KOUNTERRAA e " + counter);
		}
		return counter;
	}

	static int countOcurrences2(String needle, String haystack) {
		return (haystack.length() - haystack.replace(needle, "").length())
				/ needle.length();
	}

	static String decodeUrl(String input) throws UnsupportedEncodingException {
		return java.net.URLDecoder.decode(input, "UTF-8");
	}

	static int sumOfNumbers(String input) { // SLOW SOLUTION

		char[] a = input.toCharArray();
		int start = 0;
		if (!Character.isDigit(a[0])) {
			// System.out.println("VLIZAME LI");
			start = 1;
		}

		for (int i = 0; i < a.length; i++) {
			if (!(a[i] >= '1' && a[i] <= '9')) {
				a[i] = ' ';
			}

			// System.out.println("-> " + a[i]);
		}

		String b = new String(a);
		String[] c = b.split("\\s+");

		int sum = 0;

		// System.out.println("START IS : " + start);
		for (int i = start; i < c.length; i++) {
			sum = sum + Integer.parseInt(c[i]);
			// System.out.println("~~> " + c[i]);
		}

		return sum;
	}

	static boolean hasAnagramOf(String A, String B) {
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}

	static boolean hasAnagramOf1(String A, String B) {
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		ArrayList<Character> a1 = new ArrayList<Character>();

		for (int i = 0; i < a.length; i++) {
			a1.add(a[i]);
		}
		int counter = 0;
		for (int i = 0; i < b.length; i++) {

			if (a1.contains(b[i]) && !a1.isEmpty()) {
				a1.remove(Character.valueOf(b[i]));
				counter++;
			}
		}

		if (counter == a.length) {
			return true;
		}

		return false;

	}

	static void convertToGreyscale(String imgPth) throws IOException {
		File input = new File(imgPth);
		BufferedImage image = ImageIO.read(input);
		int width = image.getWidth();
		int height = image.getHeight();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color c = new Color(image.getRGB(j, i));
				int red = (int) (c.getRed() * 0.21);
				int green = (int) (c.getGreen() * 0.72);
				int blue = (int) (c.getBlue() * 0.07);
				int sum = red + green + blue;
				Color newColor = new Color(sum, sum, sum);
				image.setRGB(j, i, newColor.getRGB());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,11,11,11,11,11,555,555,555,555};
		//int a[] = {  2,2,2, 1,2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 , 2, 2, 3, 3, 4, 4, 5, 5, 5, 5,800, 800, 900, 900 };
		long start = System.currentTimeMillis();
	
	
		System.out.println(System.currentTimeMillis() - start);
	}

}
