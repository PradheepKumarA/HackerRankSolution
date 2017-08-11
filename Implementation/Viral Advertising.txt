import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int share = 5;
        int likes = 0;
        for(int i=0 ; i<n ; i++){
			share /= 2;
			likes += share;
			share *= 3;
		}
		System.out.println(likes);
	
    }
}