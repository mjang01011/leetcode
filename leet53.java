/*
ID: mjang
LANG: JAVA
TASK: leet53
*/

//DP Solution

import java.util.*;
import java.io.*;

public class leet53{

	public static int maxSubArray(int[] nums){
		int sum = nums[0];
		int max = nums[0];
		for(int i = 1; i < nums.length; i++){ 
			if(nums[i] > sum + nums[i]){
				sum = nums[i];
			}
			else
				sum += nums[i];
			if(sum > max)
				max = sum;
		}
		return max;
	}

	public static void main(String[] args) throws IOException{
		int[] test = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(test));
	}
}