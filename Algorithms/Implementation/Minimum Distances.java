import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
		int minDistance =n;
		for(int i=0 ; i<n-1 ; i++){
			for(int j=i+1 ; j<n ; j++ ){
				if( A[i]==A[j]){
					minDistance=Math.min(minDistance,j-i);
					break;
				}
			}
		}
		System.out.println(minDistance==n?-1:minDistance);
    }
}