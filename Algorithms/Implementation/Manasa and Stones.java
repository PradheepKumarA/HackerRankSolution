import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++ ){
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if(a>b){
				a = a+b;
				b = a-b;
				a = a-b;
			}
			if(a!=b){
				for(int j=n ; j>0 ; j-- ){
					int dis = (j-1)*a + (n-j)*b;
					System.out.print( dis + " ");
				}
			}else{
				System.out.print(a*(n-1));
			}
			System.out.println();
		}
		
    }
}
