import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Prlong output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner (System.in);
		int low = in.nextInt();
		int high = in.nextInt();
		boolean notFound = true;
		for(long i=low ; i<=high ; i++){
			long square = i*i;
			long d = String.valueOf(i).length();			
			long r = square % (long) Math.pow(10,d);
			long l = square / (long) Math.pow(10,d);
			if(r+l == i ){
				notFound=false;
				System.out.print(i + " ");
			}
		}
		if(notFound){
			System.out.print("INVALID RANGE");
		}
    }
}