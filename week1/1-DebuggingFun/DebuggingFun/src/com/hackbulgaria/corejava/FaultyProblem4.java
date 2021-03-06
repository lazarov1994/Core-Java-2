package com.hackbulgaria.corejava;

public class FaultyProblem4 {
	public static boolean areEqual(Integer e, Integer k) {
		k++;
		k--;
		return e.equals(k);
	}

	public static boolean areEqual(float a, float b) {
		
		if(Math.abs(a-b)<0.0001){
			return true;
		}
		
		else return false;
		
	}

	/**
	 * Return whether there is an index <b>i</b>, such that a[i,a.length] equals
	 * b[i, a.length];
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean haveEqualSubstrings(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			String substringA = a.substring(i, a.length() - 1);
			String substringB = b.substring(0, b.length() - 1);
			if (substringA.equals(substringB)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		//System.out.println(haveEqualSubstrings("b1","bbbbbb1"));
		System.out.println(areEqual((401/399F), 1/(399/401F)));
		//System.out.println(areEqual(new Integer(55), (Integer) 55));

	}
}
