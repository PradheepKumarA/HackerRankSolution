import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] N = new int[n];
		int[] K = new int[n];
		int[][] cases = new int [n][];
		for(int i = 0 ; i<n ; i++){
			N[i] = in.nextInt();
			K[i] = in.nextInt();
			cases[i] = new int[N[i]];
			for(int j = 0 ; j<N[i] ; j++){
				cases[i][j]=in.nextInt();
			}
		}
		int count;
		for(int i = 0 ; i<n ; i++){
			count = 0 ;
			for(int j = 0 ; j<N[i] ; j++){
				if(cases[i][j] <= 0 ){
					count++;
				}
			}
			if(count >= K[i]){
				System.out.println("NO");				
			}else{
				System.out.println("YES");
			}
		}
    }
}


Efficient

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] K = new int[n];
		int[][] cases = new int [n][];
		for(int i = 0 ; i<n ; i++){
			cases[i] = new int[in.nextInt()];
			K[i] = in.nextInt();
			for(int j = 0 ; j<cases[i].length ; j++){
				cases[i][j]=in.nextInt();
			}
		}
		int count;
		for(int i = 0 ; i<n ; i++){
			count = 0 ;
			for(int j = 0 ; j<cases[i].length ; j++){
				if(cases[i][j] <= 0 ){
					count++;
				}
			}
			if(count >= K[i]){
				System.out.println("NO");				
			}else{
				System.out.println("YES");
			}
		}
    }
}