package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public static String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        for (int i = 0 ; i < words.length; i++){
            sentence = sentence.replaceFirst(words[i], (String) reverse(words[i]));
        }
        return sentence;
    }

    private static CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
    public static void main(String[] args) {
    	System.out.println(reverseEveryWordInString(" this is siht I we reverse"));
    	
	}
}
