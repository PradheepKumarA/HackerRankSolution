import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i=0 ; i<n ; i++){
			nums[i]=in.nextInt();
		}

		int shift = 0;
		for(int i =1 ; i<n ; i++){
			for(int j=i-1 ; j>=0 ; j-- ){
				if( nums[j+1] < nums[j] ){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					shift++;
				}
				else{
					break;
				}
			}
		}
		System.out.print(shift);
    }
}