package week1;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;	
import java.util.LinkedList;
import java.util.Stack;

import javax.xml.soap.Node;



public class Main {

	public static void main(String[] args) {
	

	}



	public static int getNumberOfDigits(int input) {
		char[] chars = ("" + input).toCharArray();
		int counter = 0;
		for (int i = 0; i < chars.length; i++) {

			if (chars[i] <= '9' && chars[i] >= '0') {
				counter++;
			}
			
		}
		return counter;
	}
}
