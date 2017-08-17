import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0 ; i<n ; i++ ){
			int lower = in.nextInt();
			int higher = in.nextInt();
			int base = (int)Math.ceil(Math.sqrt(lower));
			int count=0;
			for(int j=base ; j*j<=higher ; j++){
				count++;
			}
			System.out.println(count);
		}
    }
}