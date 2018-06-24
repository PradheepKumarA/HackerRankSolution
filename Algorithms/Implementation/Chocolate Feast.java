import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int chocolates = n/c;
			int covers = chocolates ;
			while(covers>=m){
				chocolates+=covers/m;
				covers= covers - (covers/m)*(m) + (covers/m);
			}
			System.out.println(chocolates);
		}
    }
}