import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
		operation(s,t,k);
    }
	
	private static void operation(String s, String t, int k){
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		int sLength = sChar.length;
		int tLength = tChar.length;
		int match = 0;
		for(int i = 0 ; i< sLength&&i< tLength ; i++){
			if(sChar[i]==tChar[i]){
				match++;
			}else{
				break;
			}
		}
		int operationLeft = sLength + tLength - 2*match;
		int diff = k - operationLeft;
		if(operationLeft == k || (diff >= 0 && (diff % 2 == 0 || match <= (diff/2)))){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");			
		return;
	}
}