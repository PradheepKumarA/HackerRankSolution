import java.io.*;
import java.util.*;

public class Solution {
	static int n,d;
	static int nums[];

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		d = in.nextInt();
		nums = new int[n];
		for(int i=0 ; i<n ; i++){
			nums[i]=in.nextInt();
		}
		int count=0;
		for(int i=0 ; i<n-2 ; i++){
			if(ifContains(i+1 , nums[i]+d) && ifContains(i+2 , nums[i]+(2*d))){
				count++;
			}
		}
		System.out.println(count);
    }
	
	static boolean ifContains(int i , int no){
		for(; i<n ; i++ ){
			if(nums[i] == no){
				return true;
			}
		}
		return false;
	}
}