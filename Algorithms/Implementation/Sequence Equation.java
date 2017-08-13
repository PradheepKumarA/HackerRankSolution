import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n ;i++){
			a[i] = in.nextInt();
		}
		for(int x = 1; x<=n ; x++ ){
//			System.out.println( "x : " + x );
			for (int i=0 ; i<n ; i++ ){
//				System.out.println( "i : " + i );
				if(x == a[i]){
					for(int j=0 ; j<n ; j++){
//						System.out.println( "j : " + j );
						if(i+1 == a[j] ){
							System.out.println(j+1);
//							break;
						}
					}
				}
			}
		}
    }
}
