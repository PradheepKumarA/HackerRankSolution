import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException{
        /* Enter your code here. Read input from STDIN. Prlong output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int k = in.nextInt();
		long []counts = new long[k];
		for(long i=0 ; i<n ; i++){
			counts[(int)in.nextLong()%k]++;
		}
		long maxCount=0;
		for(int i=1 ; i<(k+1)/2 ; i++){
			if(counts[i]>counts[k-i]){
				maxCount+=counts[i];
			}else{
				maxCount+=counts[k-i];				
			}
		}
		if(k%2==0 && counts[k/2]>0){
			maxCount++;
		}
		if(counts[0]>0){
			maxCount++;
		}
		System.out.println(maxCount);
    }
}