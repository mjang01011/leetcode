/*
ID: mjang
LANG: JAVA
TASK: leet70
DIFFICULTY: Easy
*/

//DP Solution

import java.util.*;
import java.io.*;

public class leet70{

	public static int climbStairs(int n){
		int[] memo = new int[n + 1];
		return calc(0, n, memo);
	}

	public static int calc(int i, int n, int[] memo){
		if(i > n)
			return 0;
		if(i == n)
			return 1;
		if(memo[i] > 0)
			return memo[i];
		memo[i] = calc(i + 1, n, memo) + calc(i + 2, n, memo);
		return memo[i];
	}

	public static void main(String[] args) throws IOException{
		System.out.println(climbStairs(45));
	}
}
