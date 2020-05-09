/*
ID: mjang
LANG: JAVA
TASK: leet9
DIFFICULTY: Easy
*/

import java.util.*;
import java.io.*;

public class leet9{

	public static boolean isPalindrome(int x){
		if(x < 0 || (x % 10 == 0 && x != 0))
			return false;
		int rev = 0;
		while(x > rev){
			rev = rev * 10 + x%10;
			x /= 10;
		}
		return (x == rev || x == rev/10);
	}

	public static void main(String[] args) throws IOException{
		System.out.println(isPalindrome(10));
	}
}