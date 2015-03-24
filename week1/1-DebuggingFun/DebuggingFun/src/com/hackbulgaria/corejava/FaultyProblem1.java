package com.hackbulgaria.corejava;

public class FaultyProblem1 {
    public static void main(String[] args) {
 
    	FaultyProblem1 a = new FaultyProblem1();
    	System.out.println(a.getLargestPalindrome(125));
    }
    public long getLargestPalindrome(long N) {
        N--;
        if (Utils.isPalindrome(N)) {
            return N;
        } else {
            return getLargestPalindrome(N);
        }
    }

    
  }


