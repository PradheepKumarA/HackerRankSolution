import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		//input
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []nums = new int[n];
		for(int i=0 ; i<n ; i++){
			nums[i]=in.nextInt();
		}
		
		//businesslogic
		int []equals = new int[n];
		int []lesser = new int[n];
		int []greater = new int[n];
		int p = nums[0];
		int eq , gt, ls;
		ls = gt = -1;
		eq=0;
		equals[eq]=p;
		for(int i=1 ; i<n ; i++){
			if(nums[i]<p){
				ls++;
				lesser[ls]=nums[i];
			}else if(nums[i]>p){
				gt++;
				greater[gt]=nums[i];
			}else{
				eq++;
				equals[eq]=nums[i];
			}
		}
		
		//output
		for(int i = 0 ; i<=ls ; i++ ){
			System.out.print(lesser[i]+ " ");
		}
		for(int i = 0 ; i<=eq ; i++ ){
			System.out.print(equals[i]+ " ");
		}
		for(int i = 0 ; i<=gt ; i++ ){
			System.out.print(greater[i]+ " ");			
		}
    }
}