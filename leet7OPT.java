/*
ID: mjang
LANG: JAVA
TASK: leet7
*/

import java.util.*;
import java.io.*;

public class leet7OPT{

	public static int reverse(int x) {
        long ans = 0;
        while(x != 0){
            ans *= 10;
            ans = ans + x%10;
            x = (x - x%10)/10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
        	return 0;
        return (int) ans;

    }

	public static void main(String[] args) throws IOException{
		System.out.println(reverse(-1283917222));
	}
}