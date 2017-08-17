import java.io.*;
import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		//input
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		String nums[] = new String[n];
		String output[] = new String[n];
		for(int i=0 ; i<n ; i++ ){
			nums[i]=in.nextLine();
		}
		
		//busines logic
		int count[] = new int[100];
		for(String temp : nums ){
			String tem = temp.substring(0,temp.indexOf(" "));
			count[Integer.parseInt(tem)]++;
		}
		
		int index[] = new int[100];
		index[0]=0;
		for( int i=1 ; i<100 ; i++ ){
			index[i]=index[i-1]+count[i-1];
		}
		
		for(int i = 0 ; i<n ; i++){
			String tem = nums[i].substring(0,nums[i].indexOf(" "));
			int ind = Integer.parseInt(tem);
			if( i+1 > n/2 ){
				output[index[ind]] = nums[i].substring(nums[i].indexOf(" ") + 1);
			}else{
				output[index[ind]] = "-";
			}
			index[ind]++;
		}
		
		
		for ( String c : output ){
			System.out.print( c + " " );
		}		
    }
}