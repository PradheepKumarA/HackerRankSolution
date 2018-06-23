import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in =new Scanner (System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int beautiful =0;
		for(int l = i ; l<j ; l++){
			if(isBeautiful( l ,k )){
				beautiful++;
			}
		}
		System.out.println(beautiful);
    }

    public static boolean isBeautiful(int l , int k ){
		if((Math.abs(l-reverse(l)))%k==0){
			return true;
		}
		return false;
	}

	public static int reverse(int l ){
		int rev = 0 ;
		while(l!=0){
			rev = rev*10 + (l%10);
			l/=10;
		}
		return rev;
	}
}
