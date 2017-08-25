import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int t[] = new int[n];
		for(int i=0 ; i<n ; i++){
			t[i]=in.nextInt();
		}
		int special=0;
		int pageNo = 1 ;		
		for(int i=0 ; i<n ; i++){
			for(int j =1 ; j<=t[i] ; j++ ){
				if(j==pageNo){
					special++;
				}
				if(j%k==0 && j!=t[i]){
					pageNo++;
				}
			}
			pageNo++;
		}
		System.out.println(special);
    }
}