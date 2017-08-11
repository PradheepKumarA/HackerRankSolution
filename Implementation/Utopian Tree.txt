import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] t = new int[n];
		for(int i = 0 ; i<n ; i++){
			t[i] = in.nextInt();
		}
		int h;
		for(int i = 0 ; i<n ; i++){
			h = 1;
			for( int j=0 ; j < t[i] ; j++ ){
				if(j%2==0){
					h *= 2;
				}else{
					h += 1;
				}
			}
			System.out.println(h);
		}
    }
}