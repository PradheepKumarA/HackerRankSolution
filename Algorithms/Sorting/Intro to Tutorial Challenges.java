import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int nums[] = new int[n];
		for(int i = 0 ; i<n ; i++){
			nums[i] = in.nextInt();
		}
		for(int i = 0 ; i<n ; i++){
			if(k == nums[i]){
				System.out.println(i);
				break;
			}
		}
    }
}