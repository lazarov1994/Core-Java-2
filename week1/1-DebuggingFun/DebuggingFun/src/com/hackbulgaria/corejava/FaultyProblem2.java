package com.hackbulgaria.corejava;

public class FaultyProblem2 {

    public static int getNearestPowerOf2(int x) {
        int i = 1;
        while (x != 1) {
            x /= 2;
            i++;
        }

        return (int) Math.pow(2, i-1);
    }
	public static void main(String[] args) {
		System.out.println(getNearestPowerOf2(130));
	}
    
    

}
