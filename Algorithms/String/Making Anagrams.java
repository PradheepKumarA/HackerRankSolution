import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        // Complete this function
		char[] left = new char[26];
		char[] right = new char[26];
		for(int i=s1.length()-1 ; i>=0 ; i--){
			left[s1.charAt(i)-97]++;
		}
		for(int i=s2.length()-1 ; i>=0 ; i--){
			right[s2.charAt(i)-97]++;
		}
		int count=0;
		for( int x=0 ; x<26 ; x++ ){
			count += (int)Math.abs(left[x]-right[x]);
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
