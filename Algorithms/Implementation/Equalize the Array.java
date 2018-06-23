import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count[] = new int[101];
		for(int i=0 ; i<n ; i++){
			count[in.nextInt()]++;
		}
		
		int max=0;
		for(int c : count){
			if(c>max){
				max=c;
			}
		}
		System.out.println(n-max);
    }
}