import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int cities[] = new int[n];
		for(int i=0 ; i<p ; i++ ){
			cities[in.nextInt()]++;
		}

		int max=0;
		for(int i=0 ; i<n ; i++ ){
			if(cities[i]!=1){
				int l,m;
				for(l=i-1,m=i+1 ; l>=0 || m<n ; l--,m++ ){
					int min=n;
					if(l>=0 && cities[l]==1){
						min=Math.min(min,i-l);
					}
					if(m<n && cities[m]==1){
						min=Math.min(min,m-i);
					}
					if(min!=n){
						max=Math.max(max,min);
						break;
					}
				}
			}
		}
		System.out.println(max);
    }
}