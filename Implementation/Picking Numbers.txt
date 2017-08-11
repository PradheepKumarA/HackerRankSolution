import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
	
		//Solution
		int max = 0;
		for( int i=0 ; i<n ; i++){
			int count=1;
			for(int j=0 ; j<n ; j++ ){
				if(  i!=j && (a[i] == a[j] || a[i]+1 == a[j] ) ){
					count++;
				}
			}
			if(max<count){
				max = count;
			}
		}
		System.out.println(max);
	}
}
