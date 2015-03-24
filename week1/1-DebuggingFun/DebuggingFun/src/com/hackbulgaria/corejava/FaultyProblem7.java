package com.hackbulgaria.corejava;

import java.lang.Thread.State;
import java.util.Arrays;

public class FaultyProblem7 {
    public static int binarySearch(int element, int... array) {
     //Utils.killMeIfIGetStuck();
    //	Arrays.sort(array);
    	
        int low = 0;
        int high = array.length - 1;
        int helper;
        int mid = (low + high) / 2;
        while (high - low > 1) {

            if (element == array[mid]) {
                return mid;
            }
            if (element < array[mid]) {
            	helper = high;
                high = mid;
                mid = (mid + low)/2;
            } else {
            	helper = low;
                low = mid;
                mid = (mid + high)/2;
            }
        }

        if (array[high] == element)
            return high;
        if (array[low] == element)
            return low;

        return -1; // not found
    }
    public static void main(String[] args) {
		
    	System.out.println(binarySearch(9, 1, 2, 3, 4, 5, 6, 7, 8));
    	System.out.println(binarySearch(1, 1, 2, 3, 4, 5, 6, 7, 8));
    }
}
